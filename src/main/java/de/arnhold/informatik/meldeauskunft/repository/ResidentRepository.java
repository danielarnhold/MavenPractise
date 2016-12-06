package de.arnhold.informatik.meldeauskunft.repository;

import java.util.List;

import de.arnhold.informatik.meldeauskunft.domain.Resident;

/**
 * @author Stefan Betermieux
 */
public interface ResidentRepository {

  List<Resident> getResidents();

}
