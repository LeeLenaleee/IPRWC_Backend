package nl.hsleiden.service;

import nl.hsleiden.model.MusicModel;
import nl.hsleiden.persistence.MusicDAO;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class MusicService extends BaseService<MusicModel, MusicDAO> {
    @Inject
    public MusicService(MusicDAO dao) {
        super(dao);
    }

    public List<MusicModel> findByOmschrijving(String omschrijving) {
        return this.dao.findByOmschrijving(omschrijving);
    }
}
