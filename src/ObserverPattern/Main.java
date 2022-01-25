/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;
public class Main {

    public static void main(String args[]) {
        PublicFigure bobama = new PublicFigure("Barack Obama", "bobama");
        PublicFigure nmodi = new PublicFigure("Narendra Modi", "nmodi");
        Follower ajay = new Follower("Ajay");
        Follower vijay = new Follower("Vijay");
        Follower racheal = new Follower("Racheal");
        Follower micheal = new Follower("Micheal");
        Follower kim = new Follower("Kim");
        bobama.addSubscriber(ajay);
        bobama.addSubscriber(vijay);
        
       
       
        nmodi.addSubscriber(ajay);
        nmodi.addSubscriber(racheal);
        bobama.tweet("Hello Friends!");
        nmodi.tweet("Vande Matram!");
        bobama.removeSubscriber(vijay);
        bobama.tweet("Stay Home! Stay Safe!");
    }
}
//OUTPUT
//Name: Barack Obama, Tweet: Hello Friends!
//'Ajay' received notification from Handle: '#bobama', Tweet: 'Hello Friends!'
//'Vijay' received notification from Handle: '#bobama', Tweet: 'Hello Friends!'
//'Racheal' received notification from Handle: '#bobama', Tweet: 'Hello Friends!'
//'Micheal' received notification from Handle: '#bobama', Tweet: 'Hello Friends!'
//'Kim' received notification from Handle: '#bobama', Tweet: 'Hello Friends!'
//
//Name: Narendra Modi, Tweet: Vande Matram!
//'Ajay' received notification from Handle: '#nmodi', Tweet: 'Vande Matram!'
//'Vijay' received notification from Handle: '#nmodi', Tweet: 'Vande Matram!'
//'Racheal' received notification from Handle: '#nmodi', Tweet: 'Vande Matram!'
//'Micheal' received notification from Handle: '#nmodi', Tweet: 'Vande Matram!'
//'Kim' received notification from Handle: '#nmodi', Tweet: 'Vande Matram!'
//
//Name: Barack Obama, Tweet: Stay Home! Stay Safe!
//'Ajay' received notification from Handle: '#bobama', Tweet: 'Stay Home! Stay Safe!'
//'Vijay' received notification from Handle: '#bobama', Tweet: 'Stay Home! Stay Safe!'
//'Micheal' received notification from Handle: '#bobama', Tweet: 'Stay Home! Stay Safe!'
//'Kim' received notification from Handle: '#bobama', Tweet: 'Stay Home! Stay Safe!'
