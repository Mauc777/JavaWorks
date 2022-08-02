package Exemple004.version1;

public class Program {
    public static void main(String[] args) {

        Repository audioStorage = new Repository("audioStorage");
        audioStorage.add(new AudioContend("track_005.mp3"));
        audioStorage.add(new AudioContend("03 дорожка 03.wma"));

        for (int index = 0; index < audioStorage.count(); index++) {
            System.out.println(audioStorage.get(index));
        }


        Repository videoStorage = new Repository("videpStorage");
        videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
        videoStorage.add(new VideoContent("Новый фильм 5.3gp"));

        for (int index = 0; index < videoStorage.count(); index++) {
            System.out.println(videoStorage.get(index));
        }

        //#region
        // у нас проблема 
        // audioStorage.add(new VideoContent("dscsdcd.mp4"));
        // audioStorage.add(new AudioContend("дорожка 005.wav"));
        //Todoo  чтобы избавится от того что в базовый тип Content можно 
        //ToDoo добавить и видео и аудио надо перейти к обобщеним в version2
        //#endregion


        
    }
    
}
