import com.DBResortControl;
import com.ResTableEntity;
import org.junit.jupiter.api.Test;


class DBResortControlTest {

    @Test
    void createRes(){
        ResTableEntity res = new ResTableEntity("TEST","C_TEST","S_TEST", 99L);
        DBResortControl dbResortControl = new DBResortControl();
        dbResortControl.createRes(res);
    }

    @Test
    void deleteResById(){
        ResTableEntity res = new ResTableEntity("TEST","C_TEST","S_TEST", 99L);
        res.setId(12);
        DBResortControl dbResortControl = new DBResortControl();
        dbResortControl.deleteResById(res.getId());
    }
}
