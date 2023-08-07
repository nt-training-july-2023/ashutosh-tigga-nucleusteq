import { useState } from "react";
import "../assests/css/style.css";
const Register = () => {
    const [user, setUser] = useState({
        "fullName": "",
        "userName": "",
        "email": "",
        "number": "",
        "password": "",
        "confirmPassword": "",
        "gender": ""
    });

    const { fullName, userName, email, number, password, confirmPassword, gender } = user;

    const handleInput = (e) => {
        setUser({ ...user, [e.target.name]: e.target.value });
    }
    const submitData=()=>{
        console.log("clicked"); 
        console.log(`user full name :${user.fullName}`);
        console.log(`user name :${user.userName}`);
        console.log(`user password :${user.password}`);
        console.log(`user confirm password :${user.confirmPassword}`);
        console.log(`user email :${user.email}`);
        console.log(`user number :${user.number}`);
    }

    return (
        <div id="body">
            <div id="main_div">

                {/* <!--start of header div--> */}
                <div id="header_div">
                    <h2>Registration</h2>
                    <hr id="horizontal_line" />
                </div>
                {/* <!--end of header div--> */}

                {/* <!--start of body div--> */}
                <div class="body_div">
                    <div id="input_div1">
                        <div class="input_div">
                            <label for="Full Name">Full Name</label><br />
                            <input name="fullName" value={fullName} class="input" onChange={(e) => { handleInput(e) }} type="text" placeholder="Enter your name"  />
                        </div>
                        <div class="input_div">
                            <label for="Username">Username</label><br />
                            <input name="userName" value={userName} class="input" onChange={(e) => { handleInput(e) }} type="text" placeholder="Enter your username"  />
                        </div>
                    </div>
                    {/* <!--end of 1st input block--> */}

                    <div id="input_div2">
                        <div class="input_div">
                            <label for="Email">Email</label><br />
                            <input name="email" value={email} class="input" onChange={(e) => { handleInput(e) }} type="text" placeholder="Enter your email"  />
                        </div>
                        <div class="input_div">
                            <label for="Number">Phone Number</label><br />
                            <input name="number" value={number} class="input" onChange={(e) => { handleInput(e) }} type="text" placeholder="Enter your number"  />
                        </div>
                    </div>
                    {/* <!--end of 2nd input block--> */}

                    <div id="input_div3">
                        <div class="input_div">
                            <label for="Password">Password</label><br />
                            <input name="password" value={password} class="input" onChange={(e) => { handleInput(e) }} type="text" placeholder="Enter your password"  />
                        </div>
                        <div class="input_div">
                            <label for="Confirmpassword">Confirm Password</label><br />
                            <input name="confirmPassword" value={confirmPassword} class="input" onChange={(e) => { handleInput(e) }} type="text" placeholder="Confirm your password"  />
                        </div>
                    </div>
                    {/* <!--end of 3rd input block--> */}

                     {/* <!--start of 4th input block--> */}
                    <div id="input_div4">
                        <label>Gender</label><br />
                        <div id="input_sub_div4">
                            <div class="input_div">
                                <input type="radio" value={gender} onChange={(e) => { handleInput(e) }} name="gender" class="radio_input"  />
                                <label for="Male">Male</label>
                            </div>
                            <div class="input_div">
                                <input type="radio" value={gender} onChange={(e) => { handleInput(e) }} name="gender" class="radio_input"  />
                                <label for="Female">Female</label>
                            </div>
                            <div class="input_div">
                                <input type="radio" value={gender} onChange={(e) => { handleInput(e) }} name="gender" class="radio_input"  />
                                <label for="no">Prefer not to say</label>
                            </div>
                        </div>
                    </div>
                    {/* <!--end of 4th input block--> */}
                </div>
                {/* <!--end of body_div block--> */}

                {/* <!-- start of footer div--> */}
                <div id="footer_div">
                    <input type="button" id="input_button" value="Register" onClick={submitData} />
                </div>
                {/* <!--End of footer div--> */}
            </div>
        </div>
    )//return end
};

export default Register;
