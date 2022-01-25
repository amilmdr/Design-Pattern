/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;
public class Follower implements Observer {

    protected String name;

    public Follower(String name) {
        super();
        this.name = name;
    }
    @Override
    public void notification(String handle, String tweet) {
        System.out.printf("'%s' received notification from Handle: '%s', Tweet: '%s'\n", name, handle, tweet);
    }
}