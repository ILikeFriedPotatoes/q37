public class HiddenWord() {
    private String hiddenWord;
    public HiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    private void getHint(guess) {
        for(int i = 0; i < hiddenWord.length(); i ++) {
            String hint = "";
            if(hiddenWord.charAt(i).equals(hint.charAt(i)) ) {
                hint += hint.charAt(i);
            } else if (hiddenWord.contains(charAt(i))) {
                hint += "+";
            } else {
                hint += "*";
            }
        }
    }
}
