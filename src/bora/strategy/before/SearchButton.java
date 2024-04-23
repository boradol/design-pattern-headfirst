package bora.strategy.before;

public class SearchButton {
    private MyProgram myProgram;
    public SearchButton(MyProgram myProgram) {
        this.myProgram = myProgram;
    }
    // 검색 버튼 누르는 상황

    public void onClick() {
        if (myProgram.mode == Mode.ALL) {
            System.out.println("SEARCH ALL");
            // 전체 검색하는 코드
        } else if (myProgram.mode == Mode.IMAGE) {
            System.out.println("SEARCH IMAGE");
            // 이미지 검색하는 코드
        } else if (myProgram.mode == Mode.NEWS) {
            System.out.println("SEARCH NEWS");
            // 뉴스 검색하는 코드
        } else if (myProgram.mode == Mode.MAP) {
            System.out.println("SEARCH MAP");
            // 지도 검색하는 코드
        }
        // 새로운 기능이 추가되면... 여기 클래스에서 계속 else-if 문이 추가가 되겠지?
    }
}
