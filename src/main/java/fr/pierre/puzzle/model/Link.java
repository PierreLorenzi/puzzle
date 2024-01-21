package fr.pierre.puzzle.model;

import fr.pierre.puzzle.model.enumeration.LinkType;
import fr.pierre.puzzle.model.value.Value;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public final class Link extends GraphElement {

    private GraphElement start;

    private GraphElement end;

    private LinkType type;

    private Value factor;
}
