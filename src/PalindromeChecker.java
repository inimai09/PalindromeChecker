public static void main(String[] args){
    String input = "madam";
    boolean IsPalindrome = true;

    char[] arr = input.toCharArray();
    int left = 0;
    int right = arr.length - 1;

    while(left < right){
        if(input.charAt(left) != input.charAt(right)){
            IsPalindrome = false;
            break;
        }
        left++;
        right--;
    }
    System.out.println("Input:" + input);
    System.out.println("Is Palindrome:" + IsPalindrome);
}
