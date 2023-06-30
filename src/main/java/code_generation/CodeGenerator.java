package code_generation;
import antlr4.ut.pp.parser.MyLangLexer;
import antlr4.ut.pp.parser.MyLangParser;
import antlr4.ut.pp.parser.Visitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.ArrayList;
import java.nio.file.Path;

public class CodeGenerator {

    public static String generateCode(String text, boolean consolePrint)
    {
        Visitor visitor = new Visitor();
        MyLangLexer myLangLexer = new MyLangLexer(CharStreams.fromString(text));
        CommonTokenStream tokens = new CommonTokenStream(myLangLexer);
        MyLangParser parser = new MyLangParser(tokens);
        ParseTree tree = parser.module();
        visitor.visit(tree);
        ArrayList<String> code = visitor.getCode();
        StringBuilder result = new StringBuilder();

        int threadCount = 0;
        result.append("module Main where \n\nimport Sprockell \n\n");
        for(String threadCode : code) {
            result.append(prettyCode(threadCode) + "\n\n");
            threadCount++;
        }
        result.append("\n\nmain = [");
        for (int id = 0; id < threadCount; id++){
            result.append("prog" + id);
            if(id != threadCount)
                result.append(",");
            else
                result.append("]");
        }
        if(consolePrint){
            for(String threadCode : code) {
                System.out.println(prettyCodeWithLineNumbers(threadCode));
            }
        }
        return result.toString();
    }

    public static boolean compileFile(String input, String output, boolean consolePrint) throws IOException {
        Path inputPath = FileSystems.getDefault().getPath("", input);
        Path outputPath = FileSystems.getDefault().getPath("", output);

        String result = new String(Files.readAllBytes(inputPath));

        File outputFile = new File(outputPath.toString());
        String code = generateCode(result, consolePrint);
        FileWriter fileWriter = new FileWriter(outputFile);
        fileWriter.write(code);
        fileWriter.close();

        return true;
    }

    public static String prettyCode(String code) {
        StringBuilder result = new StringBuilder();

        for(int x = 0; x < code.length(); x++) {
            if(code.charAt(x) == ',') {
                result.append("\n      ,");
            }
            else {
                result.append(code.charAt(x));
            }
        }
        return result.toString();
    }

    public static String prettyCodeWithLineNumbers(String code) {
        StringBuilder result = new StringBuilder();
        int lineNumber = 1;
        for(int x = 0; x < code.length(); x++) {
            if(code.charAt(x) == ',') {
                result.append("\n").append(lineNumber).append("     ,");
                lineNumber++;
            }
            else {
                result.append(code.charAt(x));
            }
        }
        return result.toString();
    }
}
