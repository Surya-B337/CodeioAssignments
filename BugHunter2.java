public class BugHunter2 {
    public static void main(String[] args) {

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int arr[] = {5, -3, 0, 12, -9, 0, 7};
        for(int i=0; i < arr.length; i++){
            if(arr[i] > 0){
                positiveCount++;
            }else if(arr[i] < 0){
                negativeCount++;
            }else{
                zeroCount++;
            }
        }
        System.out.println("POSITIVE COUNT:"+positiveCount+"\n"+"NEGATIVE COUNT:"+negativeCount+"\n"+"ZERO COUNT:"+zeroCount);
        System.out.println("SECOND LARGEST IN ARRAY");
        int arr1[] = {14,28,19,33,45,12};
        int largest = arr[0];
        int secondLargest = 0;
        for(int i : arr1){
            if(i > largest){
                secondLargest = largest;
                largest = i;
            }else if(i > secondLargest && largest != i){
                secondLargest = i;
            }
        }
        System.out.println("SECOND LARGEST:"+secondLargest);
        System.out.println("ARRAY ELEMENT FREQUENCY COUNT OCCURENCES");
        int arr3[] = {2, 4, 2, 6, 2, 9, 6};
        boolean visited[] = new boolean[arr.length];
        for(int i=0; i < arr3.length; i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j=i+1; j < arr3.length; j++){
                if(arr3[i] == arr3[j]){
                    count++;
                    visited[j] = true;
                }
            }
        System.out.println(arr3[i]+" appears "+count+" times");
        }
        System.out.println("PRINT ELEMENTS AT EVEN INDEX");
        int arr4[] = {10, 20, 30, 40, 50, 60};
        for(int i=0; i < arr4.length; i++){
            if(i%2 == 0){
                System.out.print(arr4[i]+" ");
            }
        }
        System.out.println();
        System.out.println("REVERSING THE DIGIT");
        int n = 12345;
        int reverse = 0;
        while(n > 0){
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            //To remove the last digit
            n = n / 10;
        }
        System.out.println(reverse);
        System.out.println("Print Square of numbers");
        for(int i=1; i <= 15; i++){
            System.out.print(i*i+" ");
        }

        System.out.println();
        System.out.println("ARMSTRONG NUMBER");
        int orginalNum = 153;
        double sum = 0;
        int tempNum = 153;
        while(tempNum > 0){
            int lastDigit = tempNum % 10;
            sum = Math.pow(lastDigit,3) + sum;
            tempNum = tempNum / 10;
        }
        if(orginalNum == sum){
            System.out.println(orginalNum+" is a armstrong number");
        }else{
            System.out.println(orginalNum+" is not a armstrong number");
        }
        System.out.println("PALINDROME OF A NUMBER");
        int orgNum = 1221;
        int num = 1221;
        int reverseNum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            num = num / 10;
        }
        if(orgNum == reverseNum){
            System.out.println(orgNum +" is Palindrome");
        }else{
            System.out.println(orgNum +" is not a Palindrome");
        }

        System.out.println("PATTERN PRINTING");
        int  p = 5;
        for(int i=1; i <= p; i++){
            for(int j=1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        int star = 1;
        for(int i=1; i <= p; i++){
            for(int j=1; j <= p-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j <= star; j++){
                System.out.print("*");
            }
            star += 2;
            System.out.println();
        }

    }
}
