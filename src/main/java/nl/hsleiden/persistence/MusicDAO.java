package nl.hsleiden.persistence;

import nl.hsleiden.model.MusicModel;
import org.hibernate.SessionFactory;

import javax.inject.Inject;
import java.util.List;

public class MusicDAO extends BaseDAO<MusicModel> {
    Finder<MusicModel, MusicDAO> finder;

    @Inject
    public MusicDAO(SessionFactory sessionFactory) {
        super(MusicModel.class, sessionFactory);

        this.finder = new Finder(MusicModel.class, this);
    }

    public List<MusicModel> findByOmschrijving(String omschrijving) {
        return this.finder.findBy(
                (criteriaBuilder, criteriaQuery, root) ->
                        criteriaQuery.where(criteriaBuilder.like(root.get("factuurOmschrijving"), "%" + omschrijving + "%")),
                query -> query.list()
        );
    }

}
