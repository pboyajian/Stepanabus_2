package dat2017.stepanabus;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Dot;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.view.View.VISIBLE;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    List<PatternItem> dotdash = Arrays.<PatternItem>asList(
            new Dot(), new Gap(20), new Dash(30), new Gap(20));
    List<PatternItem> dots = Arrays.<PatternItem>asList(
            new Dot(), new Gap(20));
    List<PatternItem> dashes = Arrays.asList(
            new Dash(30), new Gap(20));

    //Route 10 below
    Double x10[]={39.8263, 39.824, 39.8191, 39.8184, 39.8177, 39.8175, 39.8178,
            39.8182, 39.8178, 39.8169, 39.8132, 39.8129, 39.8122, 39.8114,
            39.8124, 39.8082, 39.812, 39.813, 39.814, 39.8188, 39.8201, 39.822,
            39.8231, 39.8238, 39.8285, 39.8293, 39.8263, 39.8262, 39.823,
            39.8235, 39.8219, 39.8251, 39.8281, 39.8306, 39.8373, 39.8388,
            39.8407, 39.8414};
    Double y10[]={46.7654, 46.7637, 46.7552, 46.7559, 46.756, 46.7558, 46.7535,
            46.7531, 46.7522, 46.7524, 46.7503, 46.751, 46.7516, 46.7553, 46.764,
            46.768, 46.7679, 46.7685, 46.7699, 46.7731, 46.7727, 46.7727,
            46.7708, 46.7705, 46.7697, 46.7673, 46.7654, 46.7662, 46.7669,
            46.7698, 46.7728, 46.7751, 46.7755, 46.7762, 46.7805, 46.7855,
            46.786, 46.7841};
    Boolean route10= false;
    //Route 10a below
    Double x10a[]={39.8263, 39.8262, 39.823, 39.8235, 39.8238, 39.8285, 39.8293,
            39.8263, 39.8263, 39.824, 39.8191, 39.8184, 39.8177, 39.8175,
            39.8178, 39.8182, 39.8178, 39.8169, 39.8132, 39.8129, 39.8122,
            39.8114, 39.8124, 39.8082};
    Double y10a[]={46.7654, 46.7662, 46.7669, 46.7698, 46.7705, 46.7697, 46.7673,
            46.7654, 46.7654, 46.7637, 46.7552, 46.7559, 46.756, 46.7558,
            46.7535, 46.7531, 46.7522, 46.7524, 46.7503, 46.751, 46.7516,
            46.7553, 46.764, 46.768};
    Boolean route10a=false;
    //Route 12 below
    Double x12[]={39.8263, 39.824, 39.8191, 39.8184, 39.8177, 39.8175, 39.8177,
            39.8178, 39.818, 39.8182, 39.8182, 39.8182, 39.818, 39.8179, 39.8176,
            39.8175, 39.8174, 39.8171, 39.8169, 39.8132, 39.8129, 39.8122,
            39.8114, 39.8124, 39.8123, 39.8123, 39.8125, 39.8131, 39.8133,
            39.8146, 39.8144, 39.8144, 39.8145, 39.8155, 39.8161, 39.8163,
            39.8164, 39.8166, 39.8169, 39.8171, 39.8178, 39.818, 39.8183,
            39.8185, 39.8199, 39.8209, 39.8213, 39.8215, 39.8224, 39.823,
            39.8261, 39.8263, 39.8265, 39.8266, 39.8267, 39.8266, 39.8264, 39.8263};
    Double y12[]={46.7654, 46.7637, 46.7552, 46.7559, 46.756, 46.7558, 46.7536,
            46.7535, 46.7534, 46.7531, 46.7528, 46.7526, 46.7524, 46.7523,
            46.7523, 46.7523, 46.7524, 46.7525, 46.7525, 46.7503, 46.751,
            46.7516, 46.7553, 46.764, 46.7636, 46.7641, 46.7643, 46.765, 46.7651,
            46.7658, 46.7663, 46.7665, 46.7666, 46.767, 46.7677, 46.768, 46.7683,
            46.7684, 46.7685, 46.769, 46.769, 46.7691, 46.769, 46.7689, 46.7684,
            46.7684, 46.7682, 46.7678, 46.7673, 46.767, 46.7663, 46.7662,
            46.7659, 46.7658, 46.7656, 46.7653, 46.7653, 46.7654};
    Boolean route12=false;
    //Route 13 below
    Double x13[]={39.8263, 39.8262, 39.823, 39.8235, 39.8238, 39.8285, 39.8293,
            39.8263, 39.8263, 39.824, 39.8191, 39.8184, 39.8177, 39.8175,
            39.8178, 39.8182, 39.8178, 39.8169, 39.8132, 39.8142, 39.8256,
            39.8249, 39.83, 39.8263};
    Double y13[]={46.7654, 46.7662, 46.7669, 46.7698, 46.7705, 46.7697, 46.7673,
            46.7654, 46.7654, 46.7637, 46.7552, 46.7559, 46.756, 46.7558,
            46.7535, 46.7531, 46.7522, 46.7524, 46.7503, 46.7467, 46.7531,
            46.755, 46.7588, 46.7654};
    Boolean route13=false;
    //Route 14 below
    /*Double x14[]={39.8108, 39.8106, 39.8112, 39.8119, 39.8126, 39.813, 39.8122,
            39.8129, 39.8133, 39.8152, 39.8161, 39.8164, 39.8167, 39.8173,
            39.8173, 39.8158, 39.815, 39.8149, 39.8152, 39.8169, 39.8181,
            39.8177, 39.8143, 39.8132, 39.8169, 39.8178, 39.8182, 39.8178,
            39.8175, 39.8177, 39.8184, 39.8191, 39.824, 39.8263, 39.8263,
            39.8293, 39.8285, 39.8238, 39.8235, 39.823, 39.8262, 39.8263,
            39.8263, 39.8262, 39.823, 39.8235, 39.8238, 39.8285, 39.8293,
            39.8263, 39.8263, 39.824, 39.8191, 39.8184, 39.8177, 39.8175,
            39.8178, 39.8182, 39.8178, 39.8169, 39.8132, 39.8144, 39.8139,
            39.8128, 39.8117, 39.8115, 39.8118, 39.8122};
    Double y14[]={46.7368, 46.7374, 46.7384, 46.7397, 46.74, 46.7408, 46.7414, 46.7426,
            46.7429, 46.7425, 46.7425, 46.7422, 46.7422, 46.7427, 46.743,
            46.7432, 46.7436, 46.744, 46.7442, 46.7446, 46.7461, 46.7474,
            46.7457, 46.7503, 46.7524, 46.7522, 46.7531, 46.7535, 46.7558,
            46.756, 46.7559, 46.7552, 46.7637, 46.7654, 46.7654, 46.7673,
            46.7697, 46.7705, 46.7698, 46.7669, 46.7662, 46.7654, 46.7654,
            46.7662, 46.7669, 46.7698, 46.7705, 46.7697, 46.7673, 46.7654,
            46.7654, 46.7637, 46.7552, 46.7559, 46.756, 46.7558, 46.7535,
            46.7531, 46.7522, 46.7524, 46.7503, 46.7456, 46.7452, 46.7447,
            46.7432, 46.7426, 46.7416, 46.7414};*/
    Double x14[]={39.8263, 39.8262, 39.823, 39.8235, 39.8238, 39.8285, 39.8293,
            39.8263, 39.8263, 39.824, 39.8191, 39.8184, 39.8177, 39.8175,
            39.8178, 39.8182, 39.8178, 39.8169, 39.8132, 39.8144, 39.8139,
            39.8128, 39.8117, 39.8115, 39.8118, 39.8127, 39.813, 39.8126,
            39.8118, 39.8111, 39.8138, 39.8142, 39.8141, 39.8134, 39.8126,
            39.8121, 39.811};
    Double y14[]={46.7654, 46.7662, 46.7669, 46.7698, 46.7705, 46.7697, 46.7673,
            46.7654, 46.7654, 46.7637, 46.7552, 46.7559, 46.756, 46.7558,
            46.7535, 46.7531, 46.7522, 46.7524, 46.7503, 46.7456, 46.7452,
            46.7447, 46.7432, 46.7426, 46.7416, 46.7412, 46.7409, 46.7401,
            46.7395, 46.7384, 46.7382, 46.7377, 46.7369, 46.7359, 46.7358,
            46.7358, 46.7363};
    Boolean route14=false;
    //Route 10a below
    Double x15[]={39.8425, 39.8405, 39.8395, 39.8378, 39.8373, 39.837, 39.8367,
            39.8359, 39.8346, 39.8336, 39.8318, 39.8297, 39.8255, 39.8249,
            39.825, 39.8299, 39.8269, 39.8263, 39.824, 39.8191, 39.8184, 39.8177,
            39.8175, 39.8178, 39.8182, 39.8178, 39.8169, 39.8132, 39.8129,
            39.8122, 39.8114, 39.8124};
    Double y15[]={46.753, 46.7512, 46.7503, 46.7509, 46.7519, 46.7509, 46.7508, 46.751,
            46.7527, 46.7525, 46.7563, 46.7555, 46.7531, 46.7549, 46.7552,
            46.7588, 46.765, 46.7654, 46.7637, 46.7552, 46.7559, 46.756, 46.7558,
            46.7535, 46.7531, 46.7522, 46.7524, 46.7503, 46.751, 46.7516,
            46.7553, 46.764};
    Boolean route15=false;
    //Route 16 below
    Double x16[]={39.8261, 39.8264, 39.8264, 39.8264, 39.8263, 39.8262, 39.8261,
            39.823, 39.8235, 39.8232, 39.8232, 39.8233, 39.8239, 39.8255,
            39.8282, 39.8283, 39.8284, 39.8287, 39.8293, 39.8293, 39.8269,
            39.8267, 39.8267, 39.8266, 39.8265, 39.8262, 39.826, 39.8261,
            39.8263, 39.824, 39.8191, 39.8184, 39.8177, 39.8175, 39.8178,
            39.8182, 39.8177, 39.8178, 39.818, 39.8182, 39.8182, 39.8182, 39.818,
            39.8179, 39.8176, 39.8175, 39.8174, 39.8171, 39.8169, 39.8145,
            39.8158, 39.8177, 39.8184, 39.8212, 39.8215, 39.82, 39.8201, 39.8199,
            39.8191, 39.8191, 39.8195, 39.8201, 39.8215, 39.8224, 39.8229,
            39.8242, 39.8258, 39.831, 39.8317, 39.8335, 39.8326, 39.8317,
            39.8298, 39.8308, 39.8269, 39.8268, 39.8265};
    Double y16[]={46.7652, 46.7656, 46.7657, 46.7661, 46.7662, 46.7663, 46.7663,
            46.767, 46.7698, 46.7703, 46.7706, 46.7707, 46.7706, 46.7703,
            46.7697, 46.7696, 46.7695, 46.7689, 46.7676, 46.7674, 46.7657,
            46.7656, 46.7654, 46.7653, 46.7653, 46.7653, 46.7652, 46.7652,
            46.7654, 46.7637, 46.7552, 46.7559, 46.756, 46.7558, 46.7535,
            46.7531, 46.7536, 46.7535, 46.7534, 46.7531, 46.7528, 46.7526,
            46.7524, 46.7523, 46.7523, 46.7523, 46.7524, 46.7525, 46.7525,
            46.7511, 46.7465, 46.7475, 46.7481, 46.7494, 46.7486, 46.7476,
            46.7467, 46.7461, 46.7451, 46.7438, 46.7436, 46.7442, 46.7445,
            46.7442, 46.7447, 46.7451, 46.7465, 46.748, 46.7487, 46.7525,
            46.7545, 46.7562, 46.7555, 46.7571, 46.765, 46.7652, 46.7653};
    Boolean route16=false;
    //Route 17 below
    Double x17[]={39.8263, 39.8262, 39.823, 39.8235, 39.8238, 39.8285, 39.8293, 39.8263,
            39.8263, 39.824, 39.8191, 39.8184, 39.8177, 39.8175, 39.8178,
            39.8182, 39.8178, 39.8169, 39.8132, 39.8129, 39.8122, 39.8114,
            39.8079, 39.8065, 39.8055, 39.805};
    Double y17[]={46.7654, 46.7662, 46.7669, 46.7698, 46.7705, 46.7697, 46.7673,
            46.7654, 46.7654, 46.7637, 46.7552, 46.7559, 46.756, 46.7558,
            46.7535, 46.7531, 46.7522, 46.7524, 46.7503, 46.751, 46.7516,
            46.7553, 46.7535, 46.7516, 46.7469, 46.7455};
    Boolean route17=false;
    //Route 18 below
    Double x18[]={39.8177, 39.8191, 39.8201, 39.8212, 39.8225, 39.823, 39.8235,
            39.8238, 39.8285, 39.8293, 39.8263, 39.8263, 39.824, 39.8191,
            39.8184, 39.8177, 39.8175, 39.8178, 39.8182, 39.8178, 39.8169,
            39.8145, 39.8141, 39.816, 39.8164, 39.8131, 39.8101, 39.8105,
            39.8104, 39.8101, 39.8109, 39.8108, 39.8109, 39.8075};
    Double y18[]={46.76, 46.7632, 46.7661, 46.7673, 46.7672, 46.7669, 46.7698, 46.7705,
            46.7697, 46.7673, 46.7654, 46.7654, 46.7637, 46.7552, 46.7559,
            46.756, 46.7558, 46.7535, 46.7531, 46.7522, 46.7524, 46.7512,
            46.7525, 46.7536, 46.7522, 46.7502, 46.7489, 46.7468, 46.746,
            46.7454, 46.7438, 46.7431, 46.7427, 46.7404};
    Boolean route18=false;
    //Route 21 below
    Double x21[]={39.8335, 39.8317, 39.831, 39.829, 39.8258, 39.8241, 39.823, 39.8224,
            39.8212, 39.8198, 39.8195, 39.8191, 39.8192, 39.8199, 39.8201, 39.82,
            39.8215, 39.8212, 39.8184, 39.8177, 39.8158, 39.8145, 39.817,
            39.8178, 39.8182, 39.8178, 39.8175, 39.8177, 39.8184, 39.8191,
            39.824, 39.8263};
    Double y21[]={46.7525, 46.7487, 46.7481, 46.7474, 46.7464, 46.7451, 46.7447,
            46.7442, 46.7445, 46.744, 46.7436, 46.7438, 46.7452, 46.746, 46.7467,
            46.7476, 46.7486, 46.7494, 46.7481, 46.7475, 46.7464, 46.7511,
            46.7525, 46.7522, 46.7531, 46.7535, 46.7558, 46.756, 46.7559,
            46.7552, 46.7637, 46.7654};
    Boolean route21=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Intent intent = getIntent();

        Boolean ch1 = intent.getBooleanExtra("ch1", false);
        Boolean ch2 = intent.getBooleanExtra("ch2", false);
        Boolean ch3 = intent.getBooleanExtra("ch3", false);
        Boolean ch4 = intent.getBooleanExtra("ch4", false);
        Boolean ch5 = intent.getBooleanExtra("ch5", false);
        Boolean ch6 = intent.getBooleanExtra("ch6", false);
        Boolean ch7 = intent.getBooleanExtra("ch7", false);
        Boolean ch8 = intent.getBooleanExtra("ch8", false);
        Boolean ch9 = intent.getBooleanExtra("ch9", false);
        Boolean ch10 = intent.getBooleanExtra("ch10", false);


        TextView text1 = (TextView) findViewById(R.id.textView);
        TextView text2 = (TextView) findViewById(R.id.textView2);
        TextView text3 = (TextView) findViewById(R.id.textView3);
        TextView text4 = (TextView) findViewById(R.id.textView4);
        TextView text5 = (TextView) findViewById(R.id.textView5);
        TextView text6 = (TextView) findViewById(R.id.textView6);
        TextView text7 = (TextView) findViewById(R.id.textView7);
        TextView text8 = (TextView) findViewById(R.id.textView8);
        TextView text9 = (TextView) findViewById(R.id.textView9);
        TextView text10 = (TextView) findViewById(R.id.textView10);


        if (ch1) {
            text1.setVisibility(VISIBLE);
            route10=true;
        }
        if (ch2) {
            text2.setVisibility(VISIBLE);
            route10a=true;
        }
        if (ch3) {
            text3.setVisibility(VISIBLE);
            route12=true;
        }
        if (ch4) {
            text4.setVisibility(VISIBLE);
            route13=true;
        }
        if (ch5) {
            text5.setVisibility(VISIBLE);
            route14=true;
        }
        if (ch6) {
            text6.setVisibility(VISIBLE);
            route15=true;
        }
        if (ch7) {
            text7.setVisibility(VISIBLE);
            route16=true;
        }
        if (ch8) {
            text8.setVisibility(VISIBLE);
            route17=true;
        }
        if (ch9) {
            text9.setVisibility(VISIBLE);
            route18=true;
        }
        if (ch10) {
            text10.setVisibility(VISIBLE);
            route21=true;
        }
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        LatLng stepanakert = new LatLng(39.8177000, 46.7528000);
        mMap.addMarker(new MarkerOptions().position(stepanakert).title("Marker in Stepanakert"));


        //route 10 below
        List<LatLng> r10=new ArrayList<>();
        for (int i = 0 ; i < x10.length; i++){
            r10.add(new LatLng(x10[i],y10[i]));
        }
        if (route10){
            Polyline poly10= mMap.addPolyline(new PolylineOptions().addAll(r10)
                    .width(30));
            poly10.setPattern(dots);
        }

        //route 10a below
        List<LatLng> r10a=new ArrayList<>();
        for (int i = 0 ; i < x10a.length; i++){
            r10a.add(new LatLng(x10a[i],y10a[i]));
        }
        if (route10a){
            final Polyline poly10a=mMap.addPolyline(new PolylineOptions().addAll(r10a)
                    .color(Color.RED)
                    .width(30));
            poly10a.setPattern(dotdash);
            /*            poly10a.setClickable(true);
            mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                @Override
                public void onMapClick(LatLng clickCoords) {
                    if (PolyUtil.isLocationOnPath(clickCoords, poly10a.getPoints(), true, 100)) {
                            // user clicked on polyline
                        }

                }
            });*/
        }
        //route 12 below
        List<LatLng> r12=new ArrayList<>();
        for (int i = 0 ; i < x12.length; i++){
            r12.add(new LatLng(x12[i],y12[i]));
        }
        if (route12){
            Polyline poly12= mMap.addPolyline(new PolylineOptions().addAll(r12)
                    .color(Color.argb(255,50,220,50))//dark green
                    .width(30));
            poly12.setPattern(dashes);
        }
        //route 13 below
        List<LatLng> r13=new ArrayList<>();
        for (int i = 0 ; i < x13.length; i++){
            r13.add(new LatLng(x13[i],y13[i]));
        }
        if (route13){
            Polyline poly13= mMap.addPolyline(new PolylineOptions().addAll(r13)
                    .color(Color.YELLOW)
                    .width(25)
            );
            poly13.setPattern(dots);
        }
        //route 14 below
        List<LatLng> r14=new ArrayList<>();
        for (int i = 0 ; i < x14.length; i++){
            r14.add(new LatLng(x14[i],y14[i]));
        }
        if (route14){
            Polyline poly14= mMap.addPolyline(new PolylineOptions().addAll(r14)
                    .width(20)
                    .color(Color.argb(255,255,200,0)));//orange
            poly14.setPattern(dotdash);
        }
        //route 15 below
        List<LatLng> r15=new ArrayList<>();
        for (int i = 0 ; i < x15.length; i++){
            r15.add(new LatLng(x15[i],y15[i]));
        }
        if (route15){
            Polyline poly15= mMap.addPolyline(new PolylineOptions().addAll(r15)
                    .color(Color.argb(255,150,0,255))//purple
                    .width(20));
            poly15.setPattern(dashes);
        }
        //route 16 below
        List<LatLng> r16=new ArrayList<>();
        for (int i = 0 ; i < x16.length; i++){
            r16.add(new LatLng(x16[i],y16[i]));
        }
        if (route16){
            Polyline poly16= mMap.addPolyline(new PolylineOptions().addAll(r16)
                    .color(Color.argb(255,240,163,255))//amethyst
                    .width(10));
            poly16.setPattern(dotdash);
        }
        //route 17 below
        List<LatLng> r17=new ArrayList<>();
        for (int i = 0 ; i < x17.length; i++){
            r17.add(new LatLng(x17[i],y17[i]));
        }
        if (route17){
            Polyline poly17= mMap.addPolyline(new PolylineOptions().addAll(r17)
                    .color(Color.BLUE)
                    .width(20));
            poly17.setPattern(dots);
        }
        //route 18 below
        List<LatLng> r18=new ArrayList<>();
        for (int i = 0 ; i < x18.length; i++){
            r18.add(new LatLng(x18[i],y18[i]));
        }
        if (route18){
            Polyline poly18= mMap.addPolyline(new PolylineOptions().addAll(r18)
                    .width(10)
                    .color(Color.argb(255,153,63,0)));//brown
            poly18.setPattern(dotdash);
        }
        //route 21 below
        List<LatLng> r21=new ArrayList<>();
        for (int i = 0 ; i < x21.length; i++){
            r21.add(new LatLng(x21[i],y21[i]));
        }
        if (route21){
            Polyline poly21= mMap.addPolyline(new PolylineOptions().addAll(r21)
                    .color(Color.argb(255,148,255,181))//Jade
                    .width(10));
            poly21.setPattern(dashes);
        }
        //initial position of camera
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stepanakert,13));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

    }
}
