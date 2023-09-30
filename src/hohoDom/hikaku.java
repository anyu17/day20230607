package hohoDom;

import java.util.Scanner;

public class hikaku {
    public static void main(String[] args) {
        int[] scoresarr = getScores();
        int getmaxa = getmax(scoresarr);
        int getmina = getmin(scoresarr);
       int tem = gokei(scoresarr);
        int avg = (tem - getmaxa - getmina )/(scoresarr.length - 2);
        System.out.println(avg);

    }

    public static int gokei(int[] scoresarr) {
        int w = 0;
        for (int i = 0; i < scoresarr.length; i++) {
            w = w + scoresarr[i];
        }
        return w;
    }


    public static int getmax(int []scoresarr) {
        int max = scoresarr[0];
        for (int i = 0 ; i < scoresarr.length;i++) {
            if (max > scoresarr[i]) {
                max =scoresarr[i];
            }
        }
        return max;
    }

    public static int getmin(int []scoresarr) {
        int min = scoresarr[0];
        for (int i = 0 ; i < scoresarr.length;i++) {
            if (min < scoresarr[i]) {
                min =scoresarr[i];
            }
        }
        return min;
    }



            public static int[] getScores(){
                int[] scores = new int[6];
                Scanner sc = new Scanner(System.in);
                for (int i = 1; i <= 6; ) {
                    System.out.println("nyuryoku");
                    int score = sc.nextInt();
                    if(score >0 && score <100){
                        scores[i] = score;
                        i++;
                    }
                }
                return   scores;
            }
        }