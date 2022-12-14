package guru.springframework.sfgspringpetclinic.services.map;

import guru.springframework.sfgspringpetclinic.model.Owner;
import guru.springframework.sfgspringpetclinic.services.CrudService;
import guru.springframework.sfgspringpetclinic.services.map.AbstractMapService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
