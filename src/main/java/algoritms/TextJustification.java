package algoritms;

import java.util.*;

public class TextJustification {

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int lineLetters = 0;

        for (String word : words) {
            if (lineLetters + word.length() + currentLine.size() > maxWidth) {

                result.add(createLine(currentLine, lineLetters, maxWidth, false));

                currentLine.clear();
                lineLetters = 0;
            }
            currentLine.add(word);
            lineLetters += word.length();
        }

        result.add(createLine(currentLine, lineLetters, maxWidth, true));

        return result;
    }

    private static String createLine(List<String> line, int letters, int maxWidth, boolean isLastLine) {
        StringBuilder sb = new StringBuilder();
        int gaps = line.size() - 1;

        if (isLastLine || gaps == 0) {
            for (int i = 0; i < line.size(); i++) {
                sb.append(line.get(i));
                if (i < gaps) sb.append(" ");
            }

            while (sb.length() < maxWidth) {
                sb.append(" ");
            }
        }
        else {
            int totalSpaces = maxWidth - letters;
            int spacesPerGap = totalSpaces / gaps;
            int extraSpaces = totalSpaces % gaps;

            for (int i = 0; i < line.size(); i++) {
                sb.append(line.get(i));
                if (i < gaps) {
                    int spacesToApply = spacesPerGap + (i < extraSpaces ? 1 : 0);
                    sb.append(" ".repeat(spacesToApply));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> output = fullJustify(words, maxWidth);

        for (String line : output) {
            System.out.println("\"" + line + "\"");
        }
    }
}