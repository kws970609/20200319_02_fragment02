package fragment;

import androidx.fragment.app.Fragment;

public class RoomFragments extends Fragment {

    FragmentRoomListBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_room_list,
                container,
                false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        프래그먼트의 동작 코드 => 리스트뷰 띄워주기.

    }
