package pt.isep.enorm.ref.amazon.domain.generated;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import pt.isep.enorm.ref.amazon.domain.ContextResource;
import pt.isep.enorm.ref.amazon.domain.ContextType;
import pt.isep.enorm.ref.amazon.domain.enums.ContextKind;

@MappedSuperclass
public abstract class GeneratedContextType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 120)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private ContextKind kind;

    @OneToMany(mappedBy = "context", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ContextResource> resources = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContextKind getKind() {
        return kind;
    }

    public void setKind(ContextKind kind) {
        this.kind = kind;
    }

    public List<ContextResource> getResources() {
        return resources;
    }

    public void addResource(ContextResource resource) {
        resource.setContext((ContextType) this);
        resources.add(resource);
    }
}
