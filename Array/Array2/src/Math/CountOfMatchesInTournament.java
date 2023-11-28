package Math;
public class CountOfMatchesInTournament {
        public static int numberOfMatches(int n) {
            int matches = 0;
            int teams = n;
            while (teams != 1) {
                if (teams % 2 != 0) {
                    matches += (teams - 1) / 2;
                    teams = (teams - 1) / 2 + 1;
                } else {
                    matches += teams / 2;
                    teams = teams / 2;
                }
            }
            return matches;
        }
        public static void main(String[] args) {
            System.out.println(numberOfMatches(7));
            System.out.println((1%2)==0);
        }
}
