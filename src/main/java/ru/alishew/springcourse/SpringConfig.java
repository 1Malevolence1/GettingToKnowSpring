package ru.alishew.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.alishew.springcourse.music.Player;
import ru.alishew.springcourse.music.genresmusic.ClassicalMusic;
import ru.alishew.springcourse.music.genresmusic.KpopMusic;
import ru.alishew.springcourse.music.genresmusic.RockMusic;

import java.util.List;

@Configuration

public class SpringConfig {

    @Bean
    public ClassicalMusic musicClassical(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic musicRock(){
        return new RockMusic();
    }

    @Bean
    public KpopMusic musicKpop(){
        return  new KpopMusic();
    }

    @Bean
    public Player player(){
        Player player = new Player();
        player.addMusic(musicClassical());
        player.addMusic(musicRock());
        player.addMusic(musicKpop());
        return player;
    }
}
