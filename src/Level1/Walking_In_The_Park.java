package Level1;
public class Walking_In_The_Park {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        // park.length -> 행의 수
        int h = park.length;
        // park[i].length -> 열의 수
        int w = park[0].length();
        // 이차원 배열 선언
        Character[][] place = new Character[h][w];

        int row = 0;
        int col = 0;

        // 행의 수 만큼 반복
        for(int i = 0; i < h; i++) {
            // 열의 수 만큼 반복
            for(int j = 0; j < w; j++) {
                // park의 문자열을 문자로 잘라 이차원 배열에 저장
                place[i][j] = park[i].charAt(j);
                // S가 있는 곳의 x,y 좌표를 start 좌표에 저장
                if(place[i][j] == 'S') {
                    row = i;
                    col = j;
                }
            }
        }


        //routes 배열만큼 반복
        for(int i = 0; i < routes.length; i++) {
            // 문자열을 띄어쓰기 기준으로 슬라이스
            String[] str = routes[i].split(" ");
            // start 좌표부터
            // E일 때 더 했을 때 좌표 밖으로 안나가는지, X표시 있는지 확인
            int value = Integer.valueOf(str[1]);
            for(int j = 0; j < value; j++) {
                if(str[0].equals("E")) {
                    if(col + 1 < w ) {
                        if(!place[row][col + 1].equals('X'))
                            col += 1;
                    }

                }
                // W일 때
                if(str[0].equals("W")) {
                    if(col - 1 >= 0 ) {
                        if(!place[row][col - 1].equals('X'))
                            col -= 1;
                    }
                }
                // N일 때
                if(str[0].equals("N")) {
                    if(row - 1 >= 0 ) {
                        if(!place[row - 1][col].equals('X'))
                            row -= 1;
                    }
                }
                // S일 때
                if(str[0].equals("S")) {
                    if(row + 1 < h ) {
                        if(!place[row + 1][col].equals('X'))
                            row += 1;
                    }
                }

            }
            System.out.println(row);
            System.out.println(col);
        }

        answer[0] = row;
        answer[1] = col;

        return answer;
    }
}

