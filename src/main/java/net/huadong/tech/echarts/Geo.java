package net.huadong.tech.echarts;

import lombok.Getter;
import lombok.Setter;
import net.huadong.tech.echarts.code.Roam;
import net.huadong.tech.echarts.style.ItemStyle;

/**
 * @author liuzh
 * @since 2016-02-28 17:05
 */
@Getter
@Setter
public class Geo extends Basic<Geo> implements Component {
    private String map;
    private Roam roam;
    private ItemStyle label;
    private ItemStyle itemStyle;

    public String map() {
        return this.map;
    }

    public Geo map(String map) {
        this.map = map;
        return this;
    }

    public Roam roam() {
        return this.roam;
    }

    public Geo roam(Roam roam) {
        this.roam = roam;
        return this;
    }

    public ItemStyle label() {
        if (this.label == null) {
            this.label = new ItemStyle();
        }
        return this.label;
    }

    public Geo label(ItemStyle label) {
        this.label = label;
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    public Geo itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }
}
