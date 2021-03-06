import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NamedGraph
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title"
})
public class NamedGraph {

    /**
     * descriptive textual title
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("descriptive textual title")
    private String title;

    /**
     * descriptive textual title
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * descriptive textual title
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("title", title).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(title).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NamedGraph) == false) {
            return false;
        }
        NamedGraph rhs = ((NamedGraph) other);
        return new EqualsBuilder().append(title, rhs.title).isEquals();
    }

}
