package pl.oskarpolak.akademiakodu;

public class Task5 {

    public static void main(String[] args) {
        Task5 task = new Task5();
        task.solution("(())))(");
        task.solution("(()(()()()))(");
        task.solution("(()");
        task.solution("))))))))))(()");
        task.solution("((())()))(()))(");
        task.solution("()");

    }

    private void solution(String s) {

        int open = 0;
        int countClose = 0;
        int sum = 0;
        int x;
        
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                open++;
             //   System.out.println("open= "+open);
            }
            if ((s.charAt(i) == ')') && (open > 0)) {
                loop:
                for (x = i; x < s.length(); x++) {
                    if ((open == 0)||(s.charAt(x) == '(')) break loop;
                    if ((s.charAt(x) == ')') && (open > 0)) {
                        open=open-1;
                        sum =sum+2;
                    }
                //    System.out.println("open w )= "+open);

                }
                open=0;
                
              //  System.out.println("i= "+i+"   x= "+x);
            }
        }

        System.out.println(sum);
    }
}
