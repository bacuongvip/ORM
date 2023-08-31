package ra.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import ra.model.dto.SongDtoForm;
import ra.model.entity.Song;
import ra.model.repository.ISongRepository;

import java.io.File;
import java.io.IOException;
import java.util.List;
@Service
public class SongService implements ISongService {
    private String pathImage = "D:\\crud\\ORM - Song\\src\\main\\webapp\\WEB-INF\\upload\\";

    @Autowired
    private ISongRepository songRepository;
    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song findByID(Long id) {
        return songRepository.findByID(id);
    }

    @Override
    public void save(SongDtoForm p) {
        // xử lí chuyển đổi
        // upload file
        String filename = null;
        if(!(p.getPath().isEmpty())){
            filename = p.getPath().getOriginalFilename();
            try {
                FileCopyUtils.copy(p.getPath().getBytes(),new File(pathImage+filename));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // chuyển từ dto thành entity
        Song song = new Song(p.getId(), p.getName(), p.getCatalog(), filename);
        songRepository.save(song);
    }

    @Override
    public void delete(Long id) {
        songRepository.delete(id);
    }
}
