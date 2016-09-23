package weekone.hjx.com.webview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String html="{ \"status\":true,\"total\":5,\"tngou\":[{\"count\":550,\"description\":\"其他说明党参原产于山西上党，所以称为党参，功效与人参类似，只是效力不如人参强，同样也是实症、热症的人不能用\",\"disease\":\"\",\"fcount\":0,\"food\":\"\",\"id\":189,\"img\":\"/food/150804/5c7e50b6fcb9ab950f7c23c75ca3b19d.jpg\",\"keywords\":\"党参 人参 功效 经常出现 排骨汤 \",\"name\":\"党参\",\"rcount\":0,\"summary\":\"\",\"symptom\":\"\"},{\"count\":352,\"description\":\"光果甘草根及根茎质地较坚实，有的分枝、外皮不粗糙，表面灰棕色；断面纤维笥性，裂隙较少\",\"disease\":\"\",\"fcount\":0,\"food\":\"\",\"id\":310,\"img\":\"/food/150804/cd68f37fac0099491f24e531efd1f7d9.jpg\",\"keywords\":\"甘草 作用 根茎 有 肾上腺皮质激素 \",\"name\":\"甘草\",\"rcount\":0,\"summary\":\" \\n<p></p> \\n<p>甘草味甘，性平；归脾、胃、心、肺经；气和性缓，可升可降；</p> \\n<p>具有益气补中，缓急止痛，润肺止咳，泻火解毒，调和药性的功效；</p> \\n<p>主治脾胃虚弱，食少倦怠，心悸气短，脏躁证，腹痛泻痢，四肢挛痛，咳嗽气喘，咽喉肿痛，口舌生疮，小便淋痛，痈疮肿毒，药食中毒。</p> \\n<p></p> \\n<p></p>\",\"symptom\":\"\"},{\"count\":243,\"description\":\"食材介绍黄芪是我国自古以来的传统补药，药用历史长达2000多年，清朝宫廷有“补气诸药之最”说，在民间也有“常喝黄芪汤，防病保健康”的流传\",\"disease\":\"\",\"fcount\":0,\"food\":\"\",\"id\":498,\"img\":\"/food/150804/8d7b0d2f506b5495470679dc853df605.jpg\",\"keywords\":\"黄芪 内蒙古自治区 多种 有 我国 \",\"name\":\"黄芪\",\"rcount\":0,\"summary\":\"\",\"symptom\":\"\"},{\"count\":319,\"description\":\"人参多年生草本；主根肉质，圆柱形或纺锤形，须根细长；根状茎（芦头）短，上有茎痕（芦碗）和芽苞；茎单生，直立，先端渐尖，边缘有细尖锯齿，上面沿中脉疏被刚毛\",\"disease\":\"\",\"fcount\":0,\"food\":\"\",\"id\":986,\"img\":\"/food/150804/6e9968a78a7d486cc78a99829dcf748b.jpg\",\"keywords\":\"人参 维生素 有 皂甙 多年生 \",\"name\":\"人参\",\"rcount\":0,\"summary\":\"<p>  </p> \\n<p> <br /> </p> \\n<p> 人参味甘、微苦，性微温，归脾、肺、心、肾经，气雄体润， </p> \\n<p> 升多于降;具有补气固脱，健脾益肺，宁心益智，养血生津的功效。 </p> \\n<p></p> \\n<p>  </p> \\n<p>  </p> \\n<p></p>\",\"symptom\":\"\"},{\"count\":742,\"description\":\"它质地细腻，味道香甜，既可作主粮，又可烹制菜肴，可炒食、红烧、作汤、蒸煮，调配狮子头、肉包子、肉圆、蛋饺等佳肴名菜，还可以制成糖葫芦之类的小吃，其天然风味比放了味精还鲜美可口，令人久食不厌，多食而不伤胃\",\"disease\":\"\",\"fcount\":0,\"food\":\"\",\"id\":1032,\"img\":\"/food/150804/5541d464e5291d4a5073b53e9ccf3700.jpg\",\"keywords\":\"山药 含有 作用 延年益寿 脾胃 \",\"name\":\"山药\",\"rcount\":0,\"summary\":\" \\n<p></p> \\n<p>1.山药味甘、性平，入肺、脾、肾经。</p> \\n<p>2.不燥不腻，可健脾补肺、益胃补肾、固肾益精、聪耳明目、助五脏、强筋骨、长志安神、延年益寿。</p> \\n<p>3.主治脾胃虚弱、倦怠无力、食欲不振、久泄久痢、肺气虚燥、痰喘咳嗽、肾气亏耗、腰膝酸软、下肢痿弱、消渴尿频、遗精早泄、带下白浊、皮肤赤肿、肥胖等病症。</p> \\n<p></p> \\n<p></p>\",\"symptom\":\"\"}]}";
    private TextView tv;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = ((TextView) findViewById(R.id.tv));
        webView = ((WebView) findViewById(R.id.webview));
        WebSettings ws = webView.getSettings();
        ws.setJavaScriptEnabled(true);
        tv.setText(Html.fromHtml(html));
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
