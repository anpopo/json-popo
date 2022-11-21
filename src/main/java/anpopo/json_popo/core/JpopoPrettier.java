package anpopo.json_popo.core;

public class JpopoPrettier {
    // 기본적인 동작을 수행하는 json prettier

    public String makePretty(String ugly) {
        int indent = 0;  // 들여쓰기 뎁스
        boolean inString = false;  // 문자열 내부에 있는지 여부
        boolean inEscape = false;  // 이스케이프 문자 여부

        StringBuilder sb = new StringBuilder();

        // 리플렉션을 이용한 문자열 순회 속도 증가
        // IMPROVEMENT http://stackoverflow.com/questions/8894258/fastest-way-to-iterate-over-all-the-chars-in-a-string

        for (char c : ugly.toCharArray()) {

            // 따옴표 내부 문자 검사
            if (inString && c != '"')  {
                sb.append(c);
                continue;
            } else if (c == '"') {
                if (!inEscape) inString = !inString;
            }

            //
            if ((c == '}' || c == ']')) {
                sb.append("\n");

                indent--;
                sb.append("\t".repeat(Math.max(0, indent)));
            }
            sb.append(c);

            if (c == '{' || c == '[') {
                sb.append("\n");

                indent++;
                sb.append("\t".repeat(Math.max(0, indent)));
            } else if (c == ':') {
                sb.append(" ");
            } else if (c == ',') {
                sb.append("\n");

                // 들여쓰기 뎁스 변화 없이 추가
                sb.append("\t".repeat(Math.max(0, indent)));
            }


            if (inEscape)
                inEscape = false;
            else if (c == '\\')
                inEscape = true;
        }

        return sb.toString();
    }
}
