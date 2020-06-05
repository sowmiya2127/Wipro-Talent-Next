import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import javax.tools.ForwardingJavaFileObject;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'maxShared' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts WEIGHTED_INTEGER_GRAPH friends as parameter.
     */

    /*
     * For the weighted graph, <name>:
     *
     * 1. The number of nodes is <name>Nodes.
     * 2. The number of edges is <name>Edges.
     * 3. An edge exists between <name>From[i] and <name>To[i]. The weight of the edge is <name>Weight[i].
     *
     */

    public static int maxShared(int friendsNodes, List<Integer> friendsFrom, List<Integer> friendsTo, List<Integer> friendsWeight) {
        int size=friendsFrom.size();
        int[][] arr=new int[size][size];
        int[] arr1=new int[size];
        for(int i=0;i<size;i++){
                int x=friendsFrom.get(i);
                int y=friendsTo.get(i);
                arr[i][0]=x;
                arr[i][1]=y;
                arr1[i]=1;
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if((arr[i][0]==arr[j][0] && arr[i][1]==arr[j][1]) || (arr[i][1]==arr[j][0] && arr[i][0]==arr[j][1])){
                    arr1[i]++;
                }
            }
        }
        int max=0;
        for(int i=0;i<size;i++){
            if(max<arr1[i]){
                max=arr1[i];
            }
        }
        List<Integer> f=new ArrayList<Integer>();
        for(int i=0;i<size;i++){
            if(arr1[i]==max){
                int z=arr[i][0]*arr[i][1];
                f.add(z);
            }
        }
        max=0;
        for(int i:f){
            if(max<i){
                max=i;
            }
        }
        return max;
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] friendsNodesEdges = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int friendsNodes = Integer.parseInt(friendsNodesEdges[0]);
        int friendsEdges = Integer.parseInt(friendsNodesEdges[1]);

        List<Integer> friendsFrom = new ArrayList<>();
        List<Integer> friendsTo = new ArrayList<>();
        List<Integer> friendsWeight = new ArrayList<>();

        IntStream.range(0, friendsEdges).forEach(i -> {
            try {
                String[] friendsFromToWeight = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                friendsFrom.add(Integer.parseInt(friendsFromToWeight[0]));
                friendsTo.add(Integer.parseInt(friendsFromToWeight[1]));
                friendsWeight.add(Integer.parseInt(friendsFromToWeight[2]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.maxShared(friendsNodes, friendsFrom, friendsTo, friendsWeight);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
