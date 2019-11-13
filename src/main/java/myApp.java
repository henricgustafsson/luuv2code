public class myApp {


    //https://lexicon.udemy.com/course/spring-hibernate-tutorial/learn/lecture/8881586#overview


    public static void main(String[] args) {

        //Create the BaseBallCoach object
        Coach theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}


        /*
        | ******************************************************************************************************** *
        |  ********************************* | ~~ * -~~--~~- * --~~--~~- * ~~ | ********************************** *
        | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  *
        |  ********************************* | ~~~ --~~~  LUV2Code ~~~-- ~~~  | ********************************** *
        | ***_______________________________ | ~~ * -~~--~~- * --~~--~~- * ~~ | _________________________********* *
        | ~~| ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨ | ~~~~~~~  *
        | ~~| https://lexicon.udemy.com/course/spring-hibernate-tutorial/learn/lecture/5165294#overview | ~~~~~~~  *
        | ***_______________________________ | ~~ * -~~--~~- * --~~--~~- * ~~ | _________________________********* * 
        | ******************************************************************************************************** *









        | ******************************************************************************************************** *
        |  ********************************* | ~~ * -~~--~~- * --~~--~~- * ~~ | ********************************** *
        |  ********************************* | ~~ * --~~ Section 1 ~~~-- * ~~ | ********************************** *
        | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  *
        |  ********************************* |~~ * --~ Code example ~-- *  ~~ | ********************************** *
        | ***_______________________________ | ~~ * -~~--~~- * --~~--~~- * ~~ | _________________________********* *
        *                                                                                                          |
        *                                      Code     example:                                                   |
        *                 ~~~~~~~~~~~~~~~~~~~~~~~~~~ * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                            |
        *                                                                                                          |
        *                              ~~ * -~~--~~- * --~~--~~- * ~~                                              |
        *                                                                                                          |
        *                         //Create the BaseBallCoach object                                                |
        *                                    getDailyWorkout()                                                     |
        *                                                                                                          |
        *                                   Coach theCoach = new TrackCoach();                                     |
        *                            System.out.println(theCoach.getDailyWorkout());                               |
        *                                                                                                          |
        *                              ~~ * -~~--~~- * --~~--~~- * ~~                                              |
        *                                                                                                          |
        *                               • App should be configurable                                               |
        *                               • Easy to change to another                                                |   
        *                                       object representation                                              |
        *                                       (Hockey,Tennis etc.)                                               |
        *                                                                                                          |
        *                              ~~ * -~~--~~- * --~~--~~- * ~~                                              |
        *                                                                                                          |
        *                 ~~~~~~~~~~~~~~~~~~~~~~~~~~ * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                            |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                       |~~~~~~~~|               |~~~~~~~~~~~~~~~|                                         |
        *                       | My app | ------------> | Baseballcoach |                                         |
        *                       |~~~~~~~~| <------------ |~~~~~~~~~~~~~~~|                                         |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                   |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|                                 |
        *                   |          Class name            DESCRIPTION         |                                 |
        *                   |       ______________________________________       |                                 |
        *                   |       My app.java           -main method           |                                 |
        *                   |        BaseballCoach.java    -                     |                                 |
        *                   |       Coach.java            - Interface            |                                 |
        *                   |       TrackCoach.java       - TrackCoach           |                                 |
        *                   |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|                                 |
        *                                                                                                          |
        *                                                                                                          |
        *                 ~~~~~~~~~~~~~~~~~~~~~~~~~~ * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                            |
        *                                                                              |
        *                               • App should be configurable                                               |
        *                ~~~~~~~~~~~~~~~~~~~~~~~~~~ * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                            |
        *                                                                                                          |
        |  ********************************* | ~~ * -~~--~~- * --~~--~~- * ~~ | ********************************** *
        |  ********************************* | ~~ * --~~ Section 2 ~~~-- * ~~ | ********************************** *
        | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  *
        |  ********************************* | ~~ * --~~  SPRING  ~~~-- *  ~~ | ********************************** *
        |  ********************************* | * ~ ~ -~~--~~- * --~~--~ ~ ~ * | ********************************** *
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        |  ********************************* | * ~ ~ -~~--~~- * --~~--~ ~ ~ * | ********************************** *
        |  ********************************* | * ~ * ~~~ Section 2.1 ~~ ~ * ~ | ********************************** *
        | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~| * - * ~ Spring Container ~ * ~ | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  *
        |  ********************************* | * - * ~~  and IOC - -~ * - * ~ | ********************************** *
        |  ********************************* | * - (Inversion of Control)- *  | ********************************** *
        |  ********************************* | * ~ ~ -~~--~~- * --~~--~ ~ ~ * | ********************************** *
        *                                                                                                          |
        *                                                                                                          |        
        *                                                                                                          |                                                                                                         |
        *                       - Primary functions of spring container:                                           |
        *                       -Create and manage objects (Inversion of Control)                                  |
        *                       -Inject object dependencies (Dependency Injection)                                 |
        *                                                                                                          |
        *                                                                                                          |
        *                       |~~~~~~~~|                   |~~~~~~~~~~~~~~~~|                                    |
        *                       | My app |  ---------------> | Object Factory |                                    |
        *                       |~~~~~~~~| <---------------- |~~~~~~~~~~~~~~~~|                                    |
        *                                                               _| |_                                      |
        *                                                               \   /                                      |
        *                                                                \ /                                       |
        *                                                   |~~~~~~~~~~~~~~~~~~~~~~|                               |
        *                                                      ~ CONFIGURATION : ~                                 |
        *                                                        -BaseballCoach                                    |
        *                                                        -HockeyCoach                                      |
        *                                                        -CricketCoach                                     |
        *                                                   |~~~~~~~~~~~~~~~~~~~~~~|                               |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *       |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|       |
        *       |                                                                                          |       *
        *       |                              ------~~~~~~ * ~~~~~~------                                 |
        *       |                             --~~~   Configuring    ~~~--                                 |       *
        *       |                             --~~~ Spring Container ~~~--                                 |
        *       |                              ------~~~~~~ * ~~~~~~------                                 |       *
        *       |                                                                                          |       *
        *       |           -XML configuration file  (legacy - most legacy apps use this)                  |
        *       |           -Java Annotations (modern)                                                     |       *
        *       |           -Java Source Code                                                              |       ,
        *       |                                                                                          |       ¨
        *       |                                                                                          |       ¨
        *       |                               ------~~~~~~ * ~~~~~~------                                |
        *       |                               --~~~     Spring      ~~~--                                |       ' 
        *       |                               --~~~   Developmemnt  ~~~--                                |
        *       |                               --~~~     Process     ~~~--                                |       .
        *       |                               ------~~~~~~ * ~~~~~~------                                |
        *       |                                                                                          |
                |                                                                                          |
        *       |                             1. Configure your Spring beans                               |
        *       |                             2. Create a Spring Container                                 |
        *       |                             3.Retreive beans from Container                              |
       *        |                          -----~~~~~~~~~~~~ * ~~~~~~~~~~~~----                            |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                   --~~~~~~  1. Configure your Spring beans ~~~~~~--                      |
        *       |                                                                                          |
        *       |                       --~~~ |  ApplicationContext.xml | --~~~                            |
        *       |                                                                                          |
        *       |               <beans..>                                                                  |
        *       |                   <bean id="myCoach"                                                     |
        *       |                   class="se.lexicon.henric.luuv2code.BaseballCoach"                      |
        *       |               </beans>                                                                   |
        *       |                                                                                          |
        *       |                                                                                          |
        *       *                              * --~~~~~~~~~ * ~~~~~~~~~-- *                               |
        *       *                              * --~~ Inversion of -- ~ * ~*                               |
        *       *                              * ~ ~ * --~~ Control --~ * ~*                               |
        *       *                              * ~ ~ * --~~ (IOC) --~  ~* ~*                               |
        *       *                              *~ *~~~~~~~~~ * ~~~~~~~~~* ~*                               |
        *       |                                                                                          |
        *       |                 ~~~~~~~~~~~~~~~~~~~~~~~~~~ * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~            |
        *       |                     The object of IOC :  The approach of OUTSOURCING the                 |
        *       |                     ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨  construction & management of objects            |
        *       |                 ~~~~~~~~~~~~~~~~~~~~~~~~~~ * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~           |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |                                                                                               |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *       |                                                                                          |
        *-------| ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|--------
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |
        *                                                                                                          |

        */


