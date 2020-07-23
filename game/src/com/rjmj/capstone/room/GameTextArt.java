package com.rjmj.capstone.room;

public class GameTextArt {
    // https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_MAGENTA = "\u001B[29m";


    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public void winningArtDisplay() {
        System.out.println(ANSI_GREEN + "_______________________________________________________\n" +
                "|  You have now won the game!!!!                      |\n" +
                "|  Thank you for playing!                             |\n" +
                "|                                                     |\n" +
                "|        https://github.com/Capstone-RJMJ/capstone    |\n" +
                "|_____________________________________________________|\n");

        System.exit(1);
    }

    public void introArt() {
        System.out.println(ANSI_BLUE + "\n" +
                "                                                                                                                                                                                      \n" +
                " @@@@@@   @@@@@@@   @@@@@@@   @@@@@@@   @@@@@@@@  @@@  @@@  @@@@@@@  @@@   @@@@@@@  @@@@@@@@   @@@@@@   @@@  @@@  @@@  @@@@@@@                                                        \n" +
                "@@@@@@@@  @@@@@@@@  @@@@@@@@  @@@@@@@@  @@@@@@@@  @@@@ @@@  @@@@@@@  @@@  @@@@@@@@  @@@@@@@@  @@@@@@@   @@@  @@@  @@@  @@@@@@@@                                                       \n" +
                "@@!  @@@  @@!  @@@  @@!  @@@  @@!  @@@  @@!       @@!@!@@@    @@!    @@!  !@@       @@!       !@@       @@!  @@@  @@!  @@!  @@@                                                       \n" +
                "!@!  @!@  !@!  @!@  !@!  @!@  !@!  @!@  !@!       !@!!@!@!    !@!    !@!  !@!       !@!       !@!       !@!  @!@  !@!  !@!  @!@                                                       \n" +
                "@!@!@!@!  @!@@!@!   @!@@!@!   @!@!!@!   @!!!:!    @!@ !!@!    @!!    !!@  !@!       @!!!:!    !!@@!!    @!@!@!@!  !!@  @!@@!@!                                                        \n" +
                "!!!@!!!!  !!@!!!    !!@!!!    !!@!@!    !!!!!:    !@!  !!!    !!!    !!!  !!!       !!!!!:     !!@!!!   !!!@!!!!  !!!  !!@!!!                                                         \n" +
                "!!:  !!!  !!:       !!:       !!: :!!   !!:       !!:  !!!    !!:    !!:  :!!       !!:            !:!  !!:  !!!  !!:  !!:                                                            \n" +
                ":!:  !:!  :!:       :!:       :!:  !:!  :!:       :!:  !:!    :!:    :!:  :!:       :!:           !:!   :!:  !:!  :!:  :!:                                                            \n" +
                "::   :::   ::        ::       ::   :::   :: ::::   ::   ::     ::     ::   ::: :::   :: ::::  :::: ::   ::   :::   ::   ::                                                            \n" +
                " :   : :   :         :         :   : :  : :: ::   ::    :      :     :     :: :: :  : :: ::   :: : :     :   : :  :     :                                                             \n" +
                "                                                                                                                                                                                      \n" +
                "                                                                                                                                                                                      \n" +
                "@@@@@@@@   @@@@@@    @@@@@@@   @@@@@@   @@@@@@@   @@@@@@@@     @@@@@@@@  @@@@@@@    @@@@@@   @@@@@@@@@@       @@@@@@@   @@@@@@   @@@  @@@  @@@  @@@@@@@                @@@   @@@@@@   \n" +
                "@@@@@@@@  @@@@@@@   @@@@@@@@  @@@@@@@@  @@@@@@@@  @@@@@@@@     @@@@@@@@  @@@@@@@@  @@@@@@@@  @@@@@@@@@@@     @@@@@@@@  @@@@@@@@  @@@  @@@  @@@  @@@@@@@@              @@@@  @@@@@@@@  \n" +
                "@@!       !@@       !@@       @@!  @@@  @@!  @@@  @@!          @@!       @@!  @@@  @@!  @@@  @@! @@! @@!     !@@       @@!  @@@  @@!  @@@  @@!  @@!  @@@             @@@!!  @@!  @@@  \n" +
                "!@!       !@!       !@!       !@!  @!@  !@!  @!@  !@!          !@!       !@!  @!@  !@!  @!@  !@! !@! !@!     !@!       !@!  @!@  !@!  @!@  !@!  !@!  @!@               !@!  !@!  @!@  \n" +
                "@!!!:!    !!@@!!    !@!       @!@!@!@!  @!@@!@!   @!!!:!       @!!!:!    @!@!!@!   @!@  !@!  @!! !!@ @!@     !@!       @!@  !@!  @!@  !@!  !!@  @!@  !@!  @!@!@!@!@    @!@  !!@!!@!!  \n" +
                "!!!!!:     !!@!!!   !!!       !!!@!!!!  !!@!!!    !!!!!:       !!!!!:    !!@!@!    !@!  !!!  !@!   ! !@!     !!!       !@!  !!!  !@!  !!!  !!!  !@!  !!!  !!!@!@!!!    !@!    !!@!!!  \n" +
                "!!:            !:!  :!!       !!:  !!!  !!:       !!:          !!:       !!: :!!   !!:  !!!  !!:     !!:     :!!       !!:  !!!  :!:  !!:  !!:  !!:  !!!               !!:       !!!  \n" +
                ":!:           !:!   :!:       :!:  !:!  :!:       :!:          :!:       :!:  !:!  :!:  !:!  :!:     :!:     :!:       :!:  !:!   ::!!:!   :!:  :!:  !:!               :!:       !:!  \n" +
                " :: ::::  :::: ::    ::: :::  ::   :::   ::        :: ::::      ::       ::   :::  ::::: ::  :::     ::       ::: :::  ::::: ::    ::::     ::   :::: ::               :::  ::::: ::  \n" +
                ": :: ::   :: : :     :: :: :   :   : :   :        : :: ::       :         :   : :   : :  :    :      :        :: :: :   : :  :      :      :    :: :  :                 ::   : :  :   \n" +
                "                                                                                                                                                                                      \n" +
                "                                                                                                                                                                                      \n" +
                ANSI_RESET);
    }

    public void authorInformationDisplay() {
            System.out.println(ANSI_CYAN + "________________________________________________________\n" +
                    "|   Welcome to Apprenticeship, Escape from COVID-19    |\n" +
                    "|   This game was developed as a Capstone Project for  |\n" +
                    "|   the TLG Learning SDE Training Course.              |\n" +
                    "|                                                      |\n" +
                    "|   Start the Game           [Command: Start]          |\n" +
                    "|   Read the Intro           [Command: Intro]          |\n" +
                    "|   Exit this Program        [Command: Exit]           |\n" +
                    "|                                                      |\n" +
                    "|  Developed by Michael Lennerblom, Josh Jensen and    |\n" +
                    "|  RJ Smith. https://github.com/Capstone-RJMJ/capstone |\n" +
                    "|______________________________________________________|\n" + ANSI_RESET);
    }

    public void introText() {
        System.out.println("Welcome to the Apprenticeship!  Your journey has been hard, but I will help you");
        System.out.println("You have been intentionally injected with CoVID.  Luckily the vaccine ingredients");
        System.out.println("are located in this Mansion.  If you fail to properly mix and administer the vaccine");
        System.out.println("within 10 minutes you will die.");
        System.out.println("To move around, you simply will type 'Up' 'Back' 'Left' and 'Right' as applicable.");
    }

    public void dinningRoomDisplay() {
        System.out.println(ANSI_WHITE + "________________________________________________________\n" +
                " ______________________________________________________ \n" +
                "|                                                      |\n" +
                "|                                                      |\n" +
                "|                                                      |\n" +
                "|         -------------------------------             / \n" +
                "|        |                               |           /  \n" +
                "|        |                               |          /   \n" +
                "|        |                               |             |\n" +
                "|         -------------------------------              |\n" +
                "|                                                      |\n" +
                "|______________________________________________________|\n" + ANSI_RESET);
    }

    public void bathroomDisplay() {
        System.out.println(ANSI_WHITE + "________________________________________________________\n" +
                "                                                         |\n" +
                "                                            __________   |\n" +
                "                           _    __    _    |          |  |\n" +
                "                          /_\\  /  \\  /_\\   |          |  |\n" +
                "                          =|= | // | =|=   |          |  |\n" +
                "                           !   \\__/   !    |          |  |\n" +
                "                                 _         |          |  |\n" +
                " ___               ___          //'        |          |  |\n" +
                "[___]       _   :=|   |=:   __T_||_T__     |p=        |  |\n" +
                "|  ~|     =)_)=   |   |    [__________]    |          |  |\n" +
                "|   |      (_(    |xXx|     \\_      _/     |          |  |\n" +
                "|   |      )_)    \"\"\"\"\"       \\    /       |          |  |\n" +
                "\\___|                          |  |        |          |  |\n" +
                " |  `========,                 |  |        |          |  |\n" +
                "__`.        .'_________________|  |________|__________lc_|\n" +
                "    `.    .'                  (____)                      \\\n" +
                "    _|    |_...             .;;;;;;;;.                     \\\n" +
                "   (________);;;;          :;;;;;;;;;;:                     \\\n" +
                "        :::::::'            '::::::::'                       \\\n" +
                "|_____________________________________________________________\n" + ANSI_RESET);
    }

    public void mapDisplay() {
        System.out.println(ANSI_GREEN +
 ANSI_RESET + ANSI_BLUE +"+----------------------+" +ANSI_RESET + ANSI_RED + "             +--------------------+\n"+
 ANSI_RESET + ANSI_BLUE +"|                      |" +ANSI_RESET + ANSI_RED + "             |                    |\n"+
 ANSI_RESET + ANSI_BLUE +"|    Dining Room       |" +ANSI_RESET + ANSI_RED + "             |                    |\n"+
 ANSI_RESET + ANSI_BLUE +"|                      "+ANSI_RESET + ANSI_CYAN +"+-------------+" +ANSI_RESET + ANSI_RED + "                    |\n"+
 ANSI_RESET + ANSI_BLUE +"|                      "+ANSI_RESET + ANSI_CYAN +"|    Hall     |" +ANSI_RESET + ANSI_RED + "     Ball Room      |\n"+
 ANSI_RESET + ANSI_BLUE +"|                      "+ANSI_RESET + ANSI_CYAN +"+-------------+" +ANSI_RESET + ANSI_RED + "                    |\n"+
 ANSI_RESET + ANSI_BLUE +"|                      "+ANSI_RESET + ANSI_YELLOW +"|             |" +ANSI_RESET + ANSI_PURPLE + "                    +------------------------------------------+\n"+
 ANSI_RESET + ANSI_BLUE +"|                      "+ANSI_RESET + ANSI_YELLOW +"|             |" +ANSI_RESET + ANSI_RED + " " +ANSI_RESET + ANSI_PURPLE + "                   |                                          |\n"+
 ANSI_RESET + ANSI_BLUE +"|                      "+ANSI_RESET + ANSI_YELLOW +"|             |" +ANSI_RESET + ANSI_RED + " " +ANSI_RESET + ANSI_PURPLE + "                   |                                          |\n"+
 ANSI_RESET + ANSI_BLUE +"+----------------------+" +ANSI_RESET + ANSI_RED + "             +--------------------+" +ANSI_RESET + ANSI_PURPLE + "                                          |\n"+
 ANSI_RESET + ANSI_YELLOW +"                       |             | " +ANSI_RESET + ANSI_PURPLE + "                   |                                          |\n"+
 ANSI_RESET + ANSI_YELLOW +"                       |             |  " +ANSI_RESET + ANSI_PURPLE + "                  |             Movie Room                   |\n"+
 ANSI_RESET + ANSI_YELLOW +"                       |             |  " +ANSI_RESET + ANSI_PURPLE + "                  |                                          |\n"+
 ANSI_RESET + ANSI_BLACK +"     +-----------------+"+ ANSI_RESET + ANSI_YELLOW +"             |  " +ANSI_RESET + ANSI_PURPLE + "                  |                                          |\n"+
 ANSI_RESET + ANSI_BLACK +"     |                 |"+ ANSI_RESET + ANSI_YELLOW +"   Kitchen   |  " +ANSI_RESET + ANSI_PURPLE + "                  |               "+ANSI_RESET + ANSI_WHITE +"|---|                      |\n"+
 ANSI_RESET + ANSI_BLACK +"     |   Bathroom      |"+ ANSI_RESET + ANSI_YELLOW +"             |  " +ANSI_RESET + ANSI_PURPLE + "                  |               "               +ANSI_RESET + ANSI_WHITE +"|---|"+ANSI_RESET + ANSI_PURPLE + "                      |\n"+
 ANSI_RESET + ANSI_BLACK +"     +-----------------+"+ ANSI_RESET + ANSI_YELLOW +"-------------+  " +ANSI_RESET + ANSI_PURPLE + "                  +---------------"+ANSI_RESET + ANSI_WHITE +"|---|"+ANSI_RESET + ANSI_PURPLE +"----------------------+\n"+
 ANSI_RESET + ANSI_BLUE +"                                 +----------------+"+ANSI_RESET + ANSI_WHITE +"                       |---|\n"+
 ANSI_RESET + ANSI_BLUE +"                                 |                |"+ANSI_RESET + ANSI_WHITE +"                       |---|\n" +
 ANSI_RESET + ANSI_BLUE +"                                 |                |"+ANSI_RESET + ANSI_WHITE +"                       |---|\n"+
 ANSI_RESET + ANSI_BLUE +"                                 |                |"+ANSI_RESET + ANSI_WHITE +"                       |---|\n"+
 ANSI_RESET + ANSI_BLUE +"                                 |     Bedroom    "+ANSI_RESET + ANSI_CYAN +"+-----------------------+   |\n"+
 ANSI_RESET + ANSI_BLUE +"                                 |                "+ANSI_RESET + ANSI_CYAN +"|           Down Stairs     |\n"+
 ANSI_RESET + ANSI_BLUE +"                                 |                "+ANSI_RESET + ANSI_CYAN +"|              Hall         |\n"+
 ANSI_RESET + ANSI_BLUE +"                                 |                "+ANSI_RESET + ANSI_CYAN +"+---------------------------+\n"+
 ANSI_RESET + ANSI_BLUE +"                                 |                |\n"+
 ANSI_RESET + ANSI_BLUE +"                                 |                |\n"+
 ANSI_RESET + ANSI_BLUE +"                                 |                |\n"+
 ANSI_RESET + ANSI_BLUE +"                                 +--+-----------+-+\n"+
 ANSI_RESET + ANSI_RED +"                                    |           |\n"+
 ANSI_RESET + ANSI_PURPLE +"                        +-----------+"+ ANSI_RESET + ANSI_RED +"  Library  "+ ANSI_RESET + ANSI_YELLOW +"+----------+\n"+
 ANSI_RESET + ANSI_PURPLE +"                        |           |           " + ANSI_RESET + ANSI_YELLOW +          "|          |\n"+
 ANSI_RESET + ANSI_PURPLE +"                        |  Cave     "+ ANSI_RESET + ANSI_RED +"+-----------+" + ANSI_RESET + ANSI_YELLOW +         "   Lab    |\n"+
 ANSI_RESET + ANSI_PURPLE +"                        |           |           " + ANSI_RESET + ANSI_YELLOW +          "|          |\n"+
 ANSI_RESET + ANSI_PURPLE +"                        |           |           " + ANSI_RESET + ANSI_YELLOW +          "|          |\n"+
 ANSI_RESET + ANSI_PURPLE +"                        +-----------+           " + ANSI_RESET + ANSI_YELLOW +          "+----------+\n"+
"                                                                                                                                             \n" + ANSI_RESET);
    }

}

