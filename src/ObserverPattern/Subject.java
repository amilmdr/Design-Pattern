/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;
public interface Subject {
    public void addSubscriber(Observer observer);
    public void removeSubscriber(Observer observer);
    public void notifySubscribers(String tweet);
}
