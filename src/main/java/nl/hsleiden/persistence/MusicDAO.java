package nl.hsleiden.persistence;

import nl.hsleiden.model.MusicModel;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javax.inject.Inject;
import javax.management.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
                        criteriaQuery.where(criteriaBuilder.like(root.get("naamAlbum"), "%" + omschrijving + "%")),
                query -> query.list()
        );
    }

    public MusicModel getRandom(){
        List<MusicModel> allEntrys = super.findAll();
        ArrayList<Integer> allIds = new ArrayList<>();

        for(MusicModel i : allEntrys){
            allIds.add(i.getId());
        }

        Random random = new Random();
        return super.findById(allIds.get(random.nextInt(allIds.size())));
    }

}
