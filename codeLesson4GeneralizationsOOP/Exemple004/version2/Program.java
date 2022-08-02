package Exemple004.version2;

public class Program {
    public static void main(String[] args) {

        // После изменения в class Repository 
        // public class Repository <T extends Content>   {  }
        // nто Репозиторий не  может закрываться типами <String> и т д 
        Repository<VideoContent> stringRepository = new Repository<>("stringRepository");
        Repository<VideoContent> videoStorage = new Repository<>("stringRepository");
        // stringRepository.add("Кринж");
        stringRepository.add(new VideoContent("sdsd"));
        // stringRepository.add(new AudioContend("sdcsdc"));
        // stringRepository.add("Криповый");
        // stringRepository.add("Личинус");
        // stringRepository.add("Шеймить");
        for (int index = 0; index < stringRepository.count(); index++) {
            System.out.println(stringRepository.get(index));
        }


        //ToDoo сделать рабочим , то есть итерируемы!
        // for (Content o : videoStorage ) {
            
        // }


        //#region
        // Было
        // Repository audioStorage = new Repository("audioStorage");
        // Стало
        // Repository<AudioContend> audioStorage = new Repository<>("audioStorage");
        // audioStorage.add(new AudioContend("track_005.mp3"));
        // audioStorage.add(new AudioContend("03 дорожка 03.wma"));

        // for (int index = 0; index < audioStorage.count(); index++) {
        //     System.out.println(audioStorage.get(index));
        // }
        // Repository<VideoContent> videoStorage = new Repository<>("videpStorage");
        // videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
        // videoStorage.add(new VideoContent("Новый фильм 5.3gp"));

        // for (int index = 0; index < videoStorage.count(); index++) {
        //     System.out.println(videoStorage.get(index));
        // }
        //#endregion

        // #region
        // теперь наша проблема вроде как решена.
        // audioStorage.add(new VideoContent("dscsdcd.mp4"));
        // audioStorage.add(new AudioContend("дорожка 005.wav"));
        // #endregion

    }

}
