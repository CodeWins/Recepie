package iva.springapp.recepie.domain;

import javax.persistence.*;

/**
 * Created By iVa on 3/10/2021.
 */

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasurement uom;

    @ManyToOne
    private Recipe recipe;

    public UnitOfMeasurement getUom() {
        return uom;
    }

    public void setUom(UnitOfMeasurement uom) {
        this.uom = uom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
