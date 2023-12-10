public class MusicPlayer {

    class Song{
        String songName;
        String songArtist;
        int duration;
        Song next;

        Song (String songName,String songArtist,int duration){
            this.songName = songName;
            this.songArtist = songArtist;
            this.duration = duration;
        }
    }

    Song head,tail;


    public void addNewSong(String name, String artist,int duration){

        var newsong= new Song(name,artist,duration);

        if(head == null){
            head =tail=newsong;
        }else{
            tail.next = newsong;
            tail=newsong;

        }
    }

    public void display(){
        var current= head;

        while(current!=null){
            System.out.println("Song Name : " + current.songName);
            System.out.println("Artist Name : " + current.songArtist);
            System.out.println("Song Duration : " + current.duration+" minuts");
            current= current.next;
        }
    }

    public void remove(String name){
        var current= head;

        if(current==null){
            System.out.println("Empty Song list");
        return;}


        if(current.songName.equals(name)) {
            head = head.next;
        return; }

        while(current!=null && !current.next.songName.equals(name)){
            current= current.next;
        }

        if(current.next != null && current.next.songName.equals(name)){
        current.next=current.next.next;
        System.out.println("Song is removed");}
        else
            System.out.println("Song is not found");

    }

    public int gettotalduration() {
        var current= head;
        int total=0;

        while(current!=null){
            total+=current.duration;
            current= current.next;
        }
        return total;
    }

    public static void main(String[] args) {
        var mp= new MusicPlayer();
        mp.addNewSong("Dekhte Dekhte","Arjeet Singh",2);
        mp.addNewSong("without me","Halsy",1);
        mp.addNewSong("Dheere dherre","Arjeet Singh",3);
        mp.addNewSong("Love Mashup","Arjeet Singh",3);

        mp.display();
        mp.remove("without me");
        mp.display();

        System.out.println("Total Duration: " + mp.gettotalduration());
    }
}
