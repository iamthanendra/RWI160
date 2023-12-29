import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Array1{
    static void question1()
    {
        /*
         * 1) Java Program to copy all elements of one array into another array
         */
        int[] array = {32,32,434,54,554,55};
        int[] subarray = new int[array.length];

        //Copying Array value to its subarray
        for(int i = 0; i < array.length; i++)
            subarray[i] = array[i];
    }
    static void question2()
    {
        /*
         * 2) Java Program to find the frequency of each element in the array
         */
        int[] array = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        Map<Integer, Integer> frequency = new LinkedHashMap<>();

        for(int itr: array)
        {
            if(!frequency.containsKey(itr))
            {
                frequency.put(itr, 1);
            }
            else
            {
                int count = frequency.get(itr);
                count +=1;
                frequency.replace(itr, count);
            }
        }
        System.out.println("Element\t\t=>\tOccurance");
        for(Map.Entry e: frequency.entrySet())
        {
            System.out.println(e.getKey()+"\t\t=>\t\t"+e.getValue());
        }
        System.out.println();
    }
    static void question3()
    {
        /*
         * 3) Java Program to left rotate the elements of an array
         */
        int[] array = {32,32,434,54,554,55};   
        
        System.out.println("Before Left Rotation : "+Arrays.toString(array));
        
        int firstItem = array[0];
        for(int i = 0; i < array.length - 1; i++ )
        {
            array[i] = array[ i + 1];
        }
        array[array.length - 1] = firstItem;

        System.out.println("After Left Rotation : "+Arrays.toString(array));
    }
    static void question4()
    {
        /*
         * 4) Java Program to print the duplicate elements of an array
         */

         int [] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};  
         //Way 1 // Time Complexity O(n^2) Space Complexity O(n)
         HashSet<Integer> set = new HashSet<>(); 

         for(int i = 0; i < array.length; i++)
         {
            for(int j = i; j < array.length; j++)
            {
                if(array[i] == array[j])
                {
                    set.add(array[i]);
                }
            }
         }
         System.out.println("Duplicate Elements : "+set);

         //Way2 //Time Complexity O(n) Space Complexity O(n)
         Map<Integer, Integer> frequency = new LinkedHashMap<>();

         for(int itr: array)
         {
             if(!frequency.containsKey(itr))
             {
                 frequency.put(itr, 1);
             }
             else
             {
                 int count = frequency.get(itr);
                 count +=1;
                 frequency.replace(itr, count);
             }
         }

         System.out.print("Duplicate Elements : ");
         for(Map.Entry e : frequency.entrySet())
         {
            int count = (Integer)e.getValue();
            if(count > 1)
            System.out.print(e.getKey()+" ");
         }
         System.out.println();
    }
    static void question5()
    {
        /*
         * 5) Java Program to print the elements of an array
         */
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};

        //Way 1
        System.out.print("Items are : ");
        for(int i : array)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        //Way 1
        System.out.print("Items are : ");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        //Way 3
        System.out.println(Arrays.toString(array));

    }
    static void question6()
    {
        /*
         * 6) Java Program to print the elements of an array in reverse order
         */
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};

        //Way 1
        int n = array.length - 1;
        while(n >=0)
        System.out.print(array[n--]+" ");
        System.out.println();

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[array.length - 1 - i]+" ");
        }
        System.out.println();
    }
    static void question7()
    {
        /*
         * 7) Java Program to print the elements of an array present on even position
         */
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        
        System.out.print("Elements in Even Position : ");
        for(int i = 1; i < array.length; i += 2)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    static void question8()
    {
        /*
         * 7) Java Program to print the elements of an array present on even position
         */
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        
        System.out.print("Elements in Odd Position : ");
        for(int i = 0; i < array.length; i +=2)
            System.out.print(array[i]+" ");
        System.out.println();
    }
    static void question9()
    {
       int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};

       int largeElement = Integer.MIN_VALUE;
       for(int itr: array)
       {
            if(largeElement < itr)  largeElement = itr;
       }
       System.out.println("Largest Element in Array "+Arrays.toString(array)+" is : "+largeElement);
    }
    static void question10()
    {
       int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};

       int smallestElement = Integer.MAX_VALUE;
       for(int itr: array)
       {
            if(smallestElement > itr)  smallestElement = itr;
       }
       System.out.println("Largest Element in Array "+Arrays.toString(array)+" is : "+smallestElement);
    }
    static void question11()
    {
        /*
         * 11) Java Program to print the number of elements present in an array
         */
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Total Elements in array "+ Arrays.toString(array)+" are : "+ array.length);
    }

    static void question12()
    {
        /*
         * 12) Java Program to print the sum of all the items of the array
         */
        
         int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};
         int sum = 0;
         for(int itr: array ) sum += itr;
         System.out.println("Sum of all elements in array "+Arrays.toString(array)+" are : "+ sum);
    }

    static void question13()
    {
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        
        System.out.println("Before Right Element are : "+Arrays.toString(array));

        int rightestElement = array[array.length - 1];


        for(int i = array.length-1; i > 0; i--)
        {
            array[i] = array[i - 1];
        }
        array[0] = rightestElement;

        System.out.println("After Right Swap Elements are : "+Arrays.toString(array));
    }

    static int[] bubbleSort(int[] array)
    {
                //Bubble Sort
                for(int i = 0; i < array.length; i++)
                {
                    for(int j = 0; j < array.length - 1 - i; j++)
                    {
                        if(array[j] > array[j + 1])
                        {
                            int temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                        }
                    }
                }
                return array;
    }
    static void merge(int[] array, int beg, int mid, int end)
    {
        int n1 = mid - beg - 1;
        int n2 = end - mid;

        //Creating Left Subarray
        int[] leftSubarray = new int[n1];
        for(int i = beg; i < mid; i++)
            leftSubarray[i] = array[beg+i];

        //Creating Right Subarray
        int[] rightSubarray = new int[n2];
        for(int i = mid; i < end; i++)
            rightSubarray[i] = array[i+mid];

        int i = 0; //left sub array index
        int j = 0; //right sub array index
        // int k = beg //merged sub array index

        while(i < n1 && j < n2)
        {
            if(leftSubarray[i] < rightSubarray[j])
            {
                array[beg] = leftSubarray[i];
                i++;
            }
            else{
                array[beg] = rightSubarray[j];
                j++;
            }
            beg++;
        }

        //filling remaining left sub array
        while(i < n1)
        {
            array[beg++] = leftSubarray[i++];
        }

        //filling remaining right sub array
        while( j < n2 )
        {
            array[j++] = rightSubarray[j++];
        }

    }
    static void mergeSort(int[] array, int beg, int end)
    {
        if(beg < end)
        {
            int mid = ( beg + end )/2;
            mergeSort(array, beg, mid);
            mergeSort(array, mid, end);
            merge(array, beg, mid, end);
        }
    }
    static void applyMergeSort(int[] array)
    {
        int beg = 0, end = array.length - 1;
        mergeSort(array, beg, end);
    }
    static void question14()
    {
        /*
         * 14) Java Program to sort the elements of an array in ascending order
         */
        int[] array = {1, 2, 3, 4, 2, 8, 21, 8, 19, 1, 2, 3, 4, 2, 8, 21, 8, 19};
        System.out.println("Before Sorting : "+Arrays.toString(array));

        array = bubbleSort(array);
        System.out.println("After Sorting : "+Arrays.toString(array));

        // applyMergeSort(array);        
        // System.out.println("AfterSorting : "+Arrays.toString(array));
    }

    static void question15()
    {
        /*
         * 15) Java Program to sort the elements of an array in descending order
         */
        int[] array = {1, 2, 3, 4, 2, 8, 21, 8, 19, 1, 2, 3, 4, 2, 8, 21, 8, 19};
        System.out.println("Before Descending : "+Arrays.toString(array));

        //Bubble sort
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length - 1 - i; j++)
            {
                if(array[j] < array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("After Descending : "+Arrays.toString(array));
    }

    static void question16()
    {
        /*
         * 16) Find 3rd Largest Number in an Array
         */
        int[] array = {1, 2, 3, 4, 8, 19, 21};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int itr: array)
        {
            if(itr > firstLargest)
            {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = itr;
            }
            else if ( itr > secondLargest)
            {
                thirdLargest = secondLargest;
                secondLargest = itr;
            }
            else if( itr > firstLargest)
            {
                firstLargest = itr;
            }
        }

        System.out.println("Third Largest Item in array "+Arrays.toString(array)+" is : "+thirdLargest);
    }
    static void question17()
    {
        /*
         * 17) Find 2nd Largest Number in an Array
         */
        int[] array = {1, 2, 3, 4, 8, 19, 21};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int itr : array)
        {
            if(itr > firstLargest )
            {
                secondLargest = firstLargest;
                firstLargest = itr;
            }
            else if(itr > secondLargest)
            {
                secondLargest = itr;
            }
        }
        
        System.out.println("Second Largest Item in array "+Arrays.toString(array)+" is : "+secondLargest);

    }
    static void question18()
    {
        /*
         * 18) Find Largest Number in an Array
         */
        int[] array = {1, 2, 3, 4, 8, 19, 21};
        int largeElement = Integer.MIN_VALUE;

        for(int item: array)
        {
            if(item > largeElement) largeElement = item;
        }
        System.out.println(" Largest Item in array "+Arrays.toString(array)+" is : "+largeElement);
        
    }

    static void question19()
    {
        /*
         * 19) Find 2nd Smallest Number in an Array
         */
        int[] array = {1, 2, 3, 4, 8, 19, 21};
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int item : array)
        {
            if(firstSmallest > item)
            {
                secondSmallest = firstSmallest;
                firstSmallest  = item;
            }
            else if(secondSmallest > item)
            {
                secondSmallest = item;
            }
        }
        
        System.out.println("Second Smallest Item in array "+Arrays.toString(array)+" is : "+secondSmallest);

    }
    static void question20()
    {
        /*
         * 20) Find Smallest Number in an Array
         */
        int[] array = {1, 2, 3, 4, 8, 19, 21};
        int smallestElement = Integer.MAX_VALUE;

        for(int item: array)
        {
            if(item < smallestElement) smallestElement = item;
        }
        System.out.println(" Smallest Item in array "+Arrays.toString(array)+" is : "+smallestElement);
    }

    static void question21()
    {
        /*
         * 21) Remove Duplicate Element in unsorted Array
         */
        int[] array = {1, 2, 3, 4, 8, 19, 21, 2, 1, 1, 3, 4, 8, 19, 21, 2, 3, 4, 8, 19, 21};

        Set<Integer> set = new HashSet<>();
        for(int item: array)
        {
            set.add(item);
        }
        System.out.println("After Removing Duplicate Elements in unsorted array : "+set);
        


        /*
         * Remove Duplicate Element in sorted Array
         */
        
         int[] array1 = {1, 2, 3, 4, 8, 19, 21, 2, 1, 1, 3, 4, 8, 19, 21, 2, 3, 4, 8, 19, 21};
        Arrays.sort(array1);
        List<Integer> list = new ArrayList<>();

        for( int i = 0; i < array1.length; i++)
        {
            list.add(array1[i]);
        }

        System.out.println("List is : "+list);

        for(int i = 0; i < list.size() - 1; )
        {
            if(list.get(i) == list.get(i+1))
            {
                list.remove(i+1);
            }
            else
            {
                i++;
            }
        }
        System.out.println("List is : "+list);

    }
    static void question22()
    {
        /*
         * 22) Add Two Matrices
         */

         int[][] mat1 = {{1,2},{3,4}, {5,6}};
         int[][] mat2 = {{4,3},{2,1}, {6,5}};

         int[][] addition = new int[mat1.length][mat1[0].length];

         for(int  i = 0; i < mat1.length; i++)
         {
            for(int j = 0; j < mat1[0].length; j++)
            {
                addition[i][j] = mat1[i][j] + mat2[i][j];
            }
         }
         System.out.println("| "+ Arrays.toString(mat1[0]) +" |     | "+Arrays.toString(mat2[0])+"  |   "+Arrays.toString(addition[0]));
         System.out.println("| "+ Arrays.toString(mat1[1]) +" |  +  | "+Arrays.toString(mat2[1])+"  | = "+Arrays.toString(addition[1]));
         System.out.println("| "+ Arrays.toString(mat1[2]) +" |     | "+Arrays.toString(mat2[2])+"  |   "+Arrays.toString(addition[2]));

         System.out.println("\n------------------------------------------------------\n");
     }
     static void question23()
     {
        /*
         * 23) Multiply Two Matrices
         */
        int[][] mat1 = {{1,2},{3,4}};
        int[][] mat2 = {{4,3},{2,1}};
        int[][] multiply = new int[mat1.length][mat2[0].length];

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j <2; j++)
            {
                // int sum = 0;
                for(int k = 0; k < 2; k++)
                {
                    multiply[i][j] += mat1[i][k] *  mat2[k][j];
                }
            }
        }
        System.out.println("| "+Arrays.toString(mat1[0])+" | * | "+ Arrays.toString(mat2[0])+" | = "+Arrays.toString(multiply[0]));
        System.out.println("| "+Arrays.toString(mat1[1])+" |   | "+ Arrays.toString(mat2[1])+" | = "+Arrays.toString(multiply[1]));
     }
     static void question24()
     {
        /*
         * 24) Print Odd and Even Number from an Array
         */
        int[] array1 = {1, 2, 3, 4, 8, 19, 21, 2, 1, 1, 3, 4, 8, 19, 21, 2, 3, 4, 8, 19, 21};

        System.out.print("Odd No are : ");
        for(int itr : array1)
        {
            if(itr % 2 != 0)
            System.out.print(itr+" ");
        }
        System.out.println();

        System.out.print("Even No are : ");
        for(int itr : array1)
        {
            if(itr % 2 == 0)
            System.out.print(itr+" ");
        }
        System.out.println();

     }
     static void question25()
     {
        /*
         * 25) Transpose matrix
         */

        int[][] matrix = {{1,2,3},{3,4,6}}; //3*2
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length]; //2*3

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Before Transposing Matrix : ");
        for(int[] i : matrix)
        {
            for(int j : i)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }

        System.out.println("After Transposing Matrix : ");
        for(int[] i : transposeMatrix)
        {
            for(int j : i)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }

     }
     static void question26()
     {
        /*
         * 26) Java Program to subtract the two matrices
         */
        int[][] mat1 = {{1,2},{3,4}};
        int[][] mat2 = {{4,3},{2,1}};
        int[][] subtract = new int[2][2];

        for(int i = 0; i < mat1.length; i++)
        {
            for(int j = 0; j < mat1[0].length; j++)
            {
                subtract[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        System.out.println("| "+Arrays.toString(mat1[0])+" | - | "+ Arrays.toString(mat2[0])+" | = "+Arrays.toString(subtract[0]));
        System.out.println("| "+Arrays.toString(mat1[1])+" |   | "+ Arrays.toString(mat2[1])+" | = "+Arrays.toString(subtract[1]));

        
        System.out.println("\n---------------------------------------\n");
     }
    static void question27()
    {
        /*
         * 27) Java Program to determine whether a given matrix is an identity matrix
         */
        int[][] matrix = {{1,0,0},{0,1,0},{0,0,1}};

        if(matrix.length != matrix[0].length)
        {
            System.out.println("It is Not Identity Matrix");
            return;
        }

        boolean flag = true;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if((i == j && matrix[i][j] != 1) || (i != j &&  matrix[i][j] != 0))
                {
                    flag = false;
                    break;
                }
            }
        }

        for(int[] i: matrix)
        {
            for(int j: i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        if(flag)
            System.out.println("Given Matrix is Identity Matrix");
        else
            System.out.println("Given Matrix is not Identity Matrix");

        System.out.println("\n---------------------------------------\n");
    }
    static void question28()
    {
        /*
         * 28) Java Program to determine whether a given matrix is a sparse matrix
         */
        int[][] matrix = {{1,0,0},{0,3,0},{0,0,1}};

        int count = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                    count++;
            }
        }

        for(int[] i: matrix)
        {
            for(int j: i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        if(count >= matrix.length * matrix[0].length /2)
            System.out.print("It is Sparse Matrix");
        else
            System.out.print("It is not a Sparse Matrix");

    }
    static void question29()
    {
        int[][] matrix1 = {{1,0,0},{0,3,0},{0,0,1}};
        int[][] matrix2 = {{1,0,0},{0,3,0},{0,0,1}};   
        boolean flag = true;

        //Checking Matrix Row size
        if(matrix1.length != matrix2.length) flag = false;


        //Checking no of column in each row
        for(int i = 0; i < matrix1.length && flag; i++)
        {
            if(matrix1[i].length != matrix2[i].length)
            {
                flag = false;
                break;
            }
        }

        //Checking Elements inside matrixs
        for(int i = 0; i < matrix1.length && flag; i++)
        {
            for(int j = 0; j < matrix1[0].length; j++)
            {
                if(matrix1[i][j] != matrix2[i][j])
                {
                    flag = false;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("Given Matrix are equal");
        else
            System.out.println("Given Matrix aren't equal");
    }
    static void question30()
    {
        /*
         * Java Program to display the lower triangular matrix
         */
        int[][] matrix = {{1,2,3},{1,3,4},{2,3,1}};

        System.out.println("Left Lower Triangle : ");
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[1].length; j++)
            {
                if(i < j)
                    System.out.print("0 ");
                else
                    System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Right Lower Triangle : ");
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[1].length; j++)
            {
                if(i + j < matrix.length - 1)
                    System.out.print("0 ");
                else
                    System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }        
    }
    static void question31()
    {
        /*
         * 31) Java Program to display the upper triangular matrix
         */
        int[][] matrix = {{1,2,3},{1,3,4},{2,3,1}};
        System.out.println("Left Upper Triangle : ");
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[1].length; j++)
            {
                if(i + j >= matrix.length)
                    System.out.print("0 ");
                else
                    System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Right Upper Triangle : ");
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[1].length; j++)
            {
                if(i > j)
                    System.out.print("0 ");
                else
                    System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }        
    }
    static void question32()
    {
        /*
         * 32) Java Program to find the frequency of odd & even numbers in the given matrix
         */
        int[][] matrix = {{1,2,3},{1,3,4},{2,3,1}};
        int countEven = 0, countOdd = 0;

        for(int i = 0; i < matrix.length;i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] % 2 == 0) countEven++;
                else countOdd++;
            }
        }

        System.out.println("No of Even Elements are : "+countEven);
        System.out.println("No of Odd Elements are : "+countOdd);
    }
    static void question33()
    {
        /*
         * 33) Java Program to find the product of two matrices
         */
        int[][] mat1 = {{1,3,2},{3,1,1},{1,2,2}};
        int[][] mat2 = {{2,1,1},{1,0,1},{1,3,1}};

        int[][] product = new int[mat1.length][mat2[0].length];

        for(int i = 0; i < mat1.length; i++)
        {
            System.out.print(Arrays.toString(mat1[0]) +"  *  "+Arrays.toString(mat2[0]) + " = |  ");
            for(int j = 0; j < mat2[0].length; j++)
            {
                for(int k = 0; k < mat1[0].length; k++)
                {
                    System.out.print(mat1[i][k] + " * " + mat2[k][j]);
                    
                    if(k < mat1[0].length - 1)
                    System.out.print(" + ");

                    product[i][j] += mat1[i][k] * mat2[k][j];
                }
                System.out.print("   ");
            }
            System.out.println("|");
        }

        System.out.println("| "+Arrays.toString(mat1[0])+" |   | "+ Arrays.toString(mat2[0])+" | = "+Arrays.toString(product[0]));
        System.out.println("| "+Arrays.toString(mat1[1])+" | * | "+ Arrays.toString(mat2[1])+" | = "+Arrays.toString(product[1]));
        System.out.println("| "+Arrays.toString(mat1[2])+" | * | "+ Arrays.toString(mat2[2])+" | = "+Arrays.toString(product[2]));

    }
    static void question34()
    {
        /*
         * 34) Java Program to find the sum of each row and each column of a matrix
         */
        int[][] matrix = {{1,3,2},{3,1,1},{1,2,2}};
        int[][] matrixSum = new int[4][4];


        for(int i = 0; i < matrix.length; i++)
        {
            int j = 0, sumRow = 0, sumColumn = 0, sumDiagonal = 0; 
            for(;j < matrix[0].length; j++)
            {
                sumRow += matrix[i][j];
                sumColumn += matrix[j][i];
                matrixSum[i][j] = matrix[i][j];
                if(i==j) sumDiagonal += matrix[i][j];
            }
            matrixSum[i][j] = sumRow;
            matrixSum[j][i] = sumColumn;
            matrixSum[matrix.length-1][j] += sumDiagonal;
        }

        System.out.println(" "+Arrays.toString(matrix[0])+"  "+matrixSum[0][3]);
        System.out.println(" "+Arrays.toString(matrix[1])+"  "+matrixSum[1][3]);
        System.out.println(" "+Arrays.toString(matrix[2])+"  "+matrixSum[2][3]);
        System.out.println("  "+matrixSum[3][0]+", "+matrixSum[3][1]
                    +", "+matrixSum[3][2]+"   "+matrixSum[3][3]);

    }
    public static void main(String[] args)
    {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        question11();
        question12();
        question13();
        question14();
        question15();
        question16();
        question17();
        question18();
        question19();
        question20();
        question21();
        question22();
        question23();
        question24();
        question25();
        question26();
        question27();
        question28();
        question29();
        question30();
        question31();
        question32();
        question33();
        question34();
    }
}