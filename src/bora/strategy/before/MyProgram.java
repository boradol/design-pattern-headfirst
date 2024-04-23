package bora.strategy.before;

public class MyProgram {
    private SearchButton searchButton = new SearchButton(this);
    public Mode mode = Mode.ALL;

    // 모드 세팅
    public void setMode(Mode mode) { this.mode = mode; }

//    public static void main(String[] args) {
//        MyProgram program = new MyProgram();
//        program.setMode(Mode.ALL);
//        SearchButton searchButton = new SearchButton(program);
//        searchButton.onClick();
//        program.setMode(Mode.IMAGE);
//        searchButton.onClick();
//        program.setMode(Mode.NEWS);
//        searchButton.onClick();
//        program.setMode(Mode.MAP);
//        searchButton.onClick();
//    }
}
