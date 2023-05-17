import java.util.Scanner;
class arkhamCity {
static int findNumOfStepsRequired(int numOfPatients,int steps){
    return numOfPatients * steps;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int numOfPatients = sc.nextInt();
int steps = sc.nextInt();

int totalSteps = findNumOfStepsRequired(numOfPatients,steps);
System.out.println(totalSteps + " steps away from the asylum");
}
}