
package kr.co.kcs.oncf.ncp_device;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_device.devprot.Item;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "devprot", ElementSize = 142, LocalName = "devprot")
public class Devprot
    implements Serializable
{

    private short count_Var1;
    private Item[] item = new Item[ 7 ] ;

    @DdlField(Version = "2.0", QualName = "count-var1", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1408, ElementSize = 2, IdentifierElement = 43)
    public short getCount_Var1() {
        return count_Var1;
    }

    public void setCount_Var1(short count_Var1Param) {
        this.count_Var1 = count_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "item", ObjectClass = 0, Level = 2, Structure = 0, Offset = 1410, ElementSize = 20, IdentifierElement = 44, OccursMax = 7)
    public Item[] getItem() {
        return item;
    }

    @DdlField(Version = "2.0", QualName = "item", ObjectClass = 0, Level = 2, Structure = 0, Offset = 1410, ElementSize = 20, IdentifierElement = 44, OccursMax = 7)
    public Item getItem(int index) {
        return (item[index]);
    }

    public void setItem(Item[] itemParam) {
        this.item = itemParam;
    }

    public void setItem(int index, Item itemParam) {
        this.item[index]=itemParam;
    }

}
