package pw.seaky.paster.model;


import net.bytebuddy.utility.RandomString;
import org.springframework.data.mongodb.core.mapping.Document;
import pw.seaky.paster.utils.ExpiryOption;
import pw.seaky.paster.utils.PasteUtils;

import java.io.Serializable;


@Document(collection = "pastes")
public class Paste implements Serializable {


    private String id;
    private String title;
    private String created;
    private String[] body;
    private String raw;

    private ExpiryOption option;

    public Paste() {
        this.id = RandomString.make();
        created = PasteUtils.dateNow();
    }

    public String[] getBody() {
        return body;
    }

    public ExpiryOption getOption() {
        return option;
    }

    public void setOption(ExpiryOption option) {
        this.option = option;
    }

    public String getId() {
        return id;
    }

    public String getRaw() {
        return raw;
    }

    public String getCreated() {
        return created;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String[] body) {
        this.body = body;
    }


    public void setRaw(String unsplit) {
        this.raw = unsplit;
    }


    public void setCreated(String created) {
        this.created = created;
    }
}
