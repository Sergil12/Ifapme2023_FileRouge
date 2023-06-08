package com.ApiFilRouge.ApiFilRouge.Entity.Builder;

import com.ApiFilRouge.ApiFilRouge.Entity.Fleet;

public class FleetBuilder  implements Builder<Fleet> {
    String title="indesctrucitible";
    String description="des indestructible";
    String type="video";
    int cost= 654;

    public FleetBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public FleetBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public FleetBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public FleetBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    @Override
    public Fleet build() {
        return new Fleet(this.title, this.description, this.type, this.cost);
    }
}
