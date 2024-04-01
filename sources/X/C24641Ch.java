package X;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ch  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24641Ch implements Externalizable {
    public static final long serialVersionUID = 1;
    public List metadata_ = new ArrayList();

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            C10130fL c10130fL = new C10130fL();
            c10130fL.readExternal(objectInput);
            this.metadata_.add(c10130fL);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        int size = this.metadata_.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((C10130fL) this.metadata_.get(i)).writeExternal(objectOutput);
        }
    }
}
