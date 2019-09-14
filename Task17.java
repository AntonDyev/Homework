//Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
//таким образом:
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1

public class Task17 {
        public static void main(String[] args) {

            int[] [] grebanyiArray = new int[5] [5];

            for (int i = 0; i < grebanyiArray.length / 2 + 1; i++)
            {
                for (int j = 0; j < grebanyiArray[i].length; j++)
                {
                    if (j >= i && j < grebanyiArray[i].length - i)
                    {
                        grebanyiArray[i] [j] = 1;
                    }
                }
            }

            for (int i = grebanyiArray.length - 1; i >= grebanyiArray.length / 2; i--)
            {
                for (int j = 0; j < grebanyiArray[i].length; j++)
                {
                    if ((j >= (grebanyiArray[i].length - 1 - i)) && j <= i)
                    {
                        grebanyiArray[i] [j] = 1;
                    }
                }
            }

            for (int i = 0; i < grebanyiArray.length; i++)
            {
                for (int j = 0; j< grebanyiArray[i].length; j++)
                {
                    System.out.print(grebanyiArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
