// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a 13DTC assignment.
// You may not distribute it in any other way without permission.

/* Code for 13DTC
 * Name:
 * Username:
 * ID:
 */

import ecs100.*;

/** Program to create simple animated cartoon strips using the
 *  CartoonCharacter class.  
 */

public class CartoonStrip{

    /** tellStory creates two cartoon characters on the window.
     *  Then animates them according to a fixed script by calling a series
     *  of methods on the characters.
     */
    public void tellStory(){
    CartoonCharacter alice = new CartoonCharacter(100, 100, "alice");
    CartoonCharacter bob = new CartoonCharacter(300, 100, "bob");
    CartoonCharacter casey = new CartoonCharacter(500, 100, "casey");
    
    alice.frown();
   
    casey.lookLeft();
    bob.lookRight();
    
    casey.speak("Hey you suck coz ur dumb");
    casey.speak("and stupid idiot cringe");
    bob.frown();
    bob.speak("oh my god i hate you im cry");
    bob.speak("yo're mean you stink aaah");
    
    bob.lookLeft();
    bob.speak("oaaaah im crying im sad");
    alice.smile();
    alice.speak("Haha idiot take this L");
    bob.speak("waaaaaaaaaaaaaaaaah");    
        
    }

    /** threeDancers creates three cartoon characters on the window.
     *  Then makes each character do the same little dance in turn,
     *  by calling the dance method.
     */
    public void threeDancers(){
        /*# YOUR CODE HERE */
    }

    /** Makes a character do a little dance.
     * Has one parameter - a CartoonCharacter object
     */
    public void dance(CartoonCharacter face){
        /*# YOUR CODE HERE */
    }

}

