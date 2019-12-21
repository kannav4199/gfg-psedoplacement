
/*
Given a singly linked list of size N of integers. The task is to check if the given linked list is palindrome or not.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains length of linked list N and next line contains N integers as data of linked list.

Output:
For each test case output will be 1 if the linked list is a palindrome else 0.

User Task:
The task is to complete the function isPalindrome() which takes head as reference as the only parameter and returns true or false if linked list is palindrome or not respectively.

Constraints:
1 <= T <= 103
1 <= N <= 50

Example(To be used only for expected output):
Input:
2
3
1 2 1
4
1 2 3 4

Output:
1
0

*/


/*This is a function problem.You only need to complete the function given below*/
/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        //Your code here 
        int a=0;
        
        while(head!=null)
        {
            
            a=(a*10)+head.data;
            head=head.next;
         
       }
            
            int rev=0;
            
            int t=a;
            int rem=0;
            while(t>0){
                
                rem=t%10;
                rev=(rev*10)+rem;
                t=t/10;
                
            }
            
            
            if(rev==a)
            return true;
            
            
            return false;
    }    
}
