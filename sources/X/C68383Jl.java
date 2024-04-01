package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3Jl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68383Jl extends C39U {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public C40261rr A04;
    public C05M A05;

    public C68383Jl(Context context) {
        super(context);
        FrameLayout.inflate(context, R.layout.conversation_block_add_header, this);
        this.A00 = findViewById(R.id.content);
        this.A01 = findViewById(R.id.divider);
        this.A02 = (TextView) findViewById(R.id.add_btn);
        this.A03 = (TextView) findViewById(R.id.block_btn);
    }
}
