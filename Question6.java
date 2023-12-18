public class Question6
{
    public static void main(String[] args) {
        int[]  row = {5,4,3,2,1};
        int check =1;
        int rowno=5;
for (int each:row)
{

    for(int i=0;i<rowno;i++)
    {
        System.out.print(each);
    }
    System.out.println();
    if(check==5)
    {

    }
    else {
        for (int i = 0; i < check; i++) {
            System.out.print(row[i]);
        }
    }
    check++;
    rowno--;

}

    }
}
