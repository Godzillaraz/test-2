public class Main {
    public static void main(String[] args) {
        String slovo = "а роза упала на лапу азора";
        slovo = slovo.replaceAll(" ",
                "");
        StringBuilder stringBuilder = new StringBuilder(slovo);
        stringBuilder.reverse();
        String slovo2 = stringBuilder.toString();
        System.out.println(slovo2);
        System.out.println(slovo.equals(slovo2));
    }
}
