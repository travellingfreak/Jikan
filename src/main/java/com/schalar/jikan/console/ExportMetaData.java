package com.schalar.jikan.console;

import com.schalar.jikan.parser.MetadataParser;
import org.jetbrains.annotations.NotNull;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static com.schalar.jikan.helper.Constants.__DIR__;

public class ExportMetaData {
    private static final Path MODEL_DIRECTORY = new File(__DIR__ + "\\src\\main\\java\\com\\schalar\\jikan\\model").toPath();

    private static final Map<String, String> classmap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        Files.walk(MODEL_DIRECTORY).forEach(path -> {
            if (!path.toFile().isFile()) return;

            String shortName = path.getFileName().toString().replace(".java", "");
            String name = path.toString().replace(__DIR__ + "\\src\\main\\java\\", "").replace(".java", "").replace("\\", ".");

            if (shortName.equalsIgnoreCase("package-info") || shortName.equalsIgnoreCase("Model")) return;

            classmap.put(shortName, name);
        });

        classmap.forEach((clazz, fqcn) -> {
            System.out.print(String.format("Processing %s", fqcn));
            var parser = new MetadataParser(fqcn);
            var properties = parser.getParsedProperties();
            var filename = fqcn.replace("\\", ".") + ".yml";

            var yaml = new Yaml(dumperOptions());
            var contents = yaml.dump(properties);

            try {
                Files.write(Paths.get(__DIR__ + "\\src\\main\\resources\\metadata\\" + filename), contents.getBytes());
            } catch (IOException e) {
                return;
            }
            System.out.println(" OK!");
        });
    }

    private static @NotNull DumperOptions dumperOptions() {
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        return dumperOptions;
    }

}
