import  java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {

                // Test the functions
                List<String> listOfCoolThings = new ArrayList<>();
                listOfCoolThings.add("Foxes");
                listOfCoolThings.add("amoeba");
                listOfCoolThings.add("Peanut butter");
                listOfCoolThings.add("amoeba");
                listOfCoolThings.add("Dragons");

                System.out.println("Your original List: " + listOfCoolThings);
                findAndDestroyAllAmoebas(listOfCoolThings);
                System.out.println("Your list after removing amoebas: " + listOfCoolThings);

                List<Character> charList = stringToArray("Fox");
                System.out.println("Your char List: " + charList);

                List<Integer> intList = createListWithBounds(5, 10, 1);
                System.out.println("Your integer List: " + intList);


                List<Integer> reversedList = reverseList(intList);
                System.out.println("Here is your reversed List: " + reversedList);
            }

            public static List<Character> stringToArray(String str) {
                List<Character> charList = new ArrayList<>();
                for (char c : str.toCharArray()) {
                    charList.add(c);
                }
                return charList;
            }

            public static List<Integer> createListWithBounds(int start, int end, int step) {
                List<Integer> intList = new ArrayList<>();
                for (int i = start; i < end; i += step) {
                    intList.add(i);
                }
                return intList;
            }

            public static List<Integer> reverseList(List<Integer> list) {
                List<Integer> reversedList = new ArrayList<>(list);
                java.util.Collections.reverse(reversedList);
                return reversedList;
            }

            public static void findAndDestroyAllAmoebas(List<String> list) {
                list.removeIf(str -> str.toLowerCase().contains("amoeba"));
            }
        }


