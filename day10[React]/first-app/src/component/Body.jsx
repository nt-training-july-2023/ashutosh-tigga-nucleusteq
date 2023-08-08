import { useState } from "react";
import "../assests/css/style.css";
const Body = () => {

    const [fullName, setFullName] = useState("");
    const [userName, setUserName] = useState("");
    const [email, setEmail] = useState("");
    const [number, setNumber] = useState("");
    const [gender, setGender] = useState("male");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");
    const [allEntry, setAllEntry] = useState([]);

    const ValidateName = () => {
        console.log(`full name : ${fullName}`);
        const name = fullName.trim().toLowerCase();
        if (name.length <= 5) {
            window.alert(`Your name length must be greater than 5 !! \n Please enter correctly`)
        }
        for (let i = 0; i < name.length; i++) {
            let ch = name.charAt(i);
            if ((ch >= 0 && ch <= 9) ||
                (ch == "!") ||
                (ch == "@") ||
                (ch == "#") ||
                (ch == "$") ||
                (ch == "%") ||
                (ch == "^") ||
                (ch == "&") ||
                (ch == "*") ||
                (ch == "(") ||
                (ch == ")") ||
                (ch == "_") ||
                (ch == "-") ||
                (ch == "+") ||
                (ch == "=") ||
                (ch == " ")) {
                window.alert(`It must not contains this ${ch} !! \nIt must contains alphabets `);
            }//end if
        }//end for
    }//end validatename method

    const ValidateUserName = () => {
        console.log(`user name : ${userName}`);
        if (userName.length < 8) {
            alert(`user name must contain min of 8 length `);
        } else if (userName.length >= 8) {
            for (let i = 0; i < userName.length; i++) {
                let ch = userName.charAt(i);
                let valid = (ch >= 0) && (ch <= 9) ||
                    (ch >= 'a') && (ch <= 'z') ||
                    (ch >= 'A') && (ch <= 'Z') ||
                    (ch == '@') ||
                    (ch == '$') ||
                    (ch == '_') ||
                    (ch == '#');
                if (valid) {

                } else {
                    alert("user name length should be of min 8 length \n it must contains combination and numeric and alhabets \n you can also use speacial keyword like @ , # , _ ");
                }//end if else inner
            }//end for
        }//end if else outer
    }//end of validusername method

    const ValidateEmail = () => {
        console.log(`email : ${email}`);
        const emailLowerCase = email.toLowerCase();
        const user = emailLowerCase.substring(0, email.length - 9);
        if (user.length <= 5) {
            alert("user id must not be less than and equals to 5");
        } else if (user.length > 5) {
            for (let i = 0; i < user.length; i++) {
                let ch = user.charAt(i);
                let valid = (ch >= 0) && (ch <= 9) ||
                    (ch >= 'a') && (ch <= 'z') ||
                    (ch >= 'A') && (ch <= 'Z') ||
                    (ch == '@') || (ch == '$') ||
                    (ch == '_') || (ch == '#') ||
                    (ch == '.');
                if (valid) {
                    console.log("valid")
                } else {
                    alert("email user name is not valid it must contains and alpphabets , numberic and special character @ , $ , _");
                }//end if else
            }
            if (emailLowerCase.includes("@gmail.com") || emailLowerCase.includes("@hotmail.com") || emailLowerCase.includes("@nucleusteq.com") || emailLowerCase.includes("@outlook.com")) {
                console.log("valid");
            } else {
                window.alert("not valid email please insert correct email");
            }//end of if else
        }
    }

    const ValidateNumber = () => {
        if (number.length == 10) {
            for (let index = 0; index < number.length; index++) {
                if ((number.charAt(index) >= 0) || (number.charAt(index) <= 9)) {
                    console.log("valid number");
                } else {
                    alert(" it must not contains data rather than numeric data ");
                }//end of inner if else
            }//end of for loop
        } else {
            alert(`not valid one ${number} it must contains 10 digit`);
        }//end of outer if else
        console.log(`Number : ${number}`);
    }//end of valid number method

    const ValidatePassword = () => {

        console.log(`password : ${password}`);
    }

    const VaidateConfirmPassword = () => {
        console.log(`confirm password : ${confirmPassword}`);
    }

    const save = (e) => {
        e.preventDefault();
        const newEntry = { fullName: fullName, userName: userName, email: email, number: number, gender: gender, password: password };
        setAllEntry([...allEntry, newEntry]);
        console.log(`all entry :${allEntry}`)
    }

    const submitData = (e) => {
        ValidateName();
        ValidateUserName();
        ValidateEmail();
        ValidateNumber();
        ValidatePassword();
        VaidateConfirmPassword();
        save(e);
    }
    return (
        <>
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
                                <input name="fullName" value={fullName} class="input" onChange={(e) => { setFullName(e.target.value) }} type="text" placeholder="Enter your name" required />
                            </div>
                            <div class="input_div">
                                <label for="Username">Username</label><br />
                                <input name="userName" value={userName} class="input" onChange={(e) => { setUserName(e.target.value) }} type="text" placeholder="Enter your username" required />
                            </div>
                        </div>
                        {/* <!--end of 1st input block--> */}

                        <div id="input_div2">
                            <div class="input_div">
                                <label for="Email">Email</label><br />
                                <input name="email" value={email} class="input" onChange={(e) => { setEmail(e.target.value) }} type="text" placeholder="Enter your email" required />
                            </div>
                            <div class="input_div">
                                <label for="Number">Phone Number</label><br />
                                <input name="number" value={number} class="input" onChange={(e) => { setNumber(e.target.value) }} type="text" placeholder="Enter your number" required />
                            </div>
                        </div>
                        {/* <!--end of 2nd input block--> */}

                        <div id="input_div3">
                            <div class="input_div">
                                <label for="Password">Password</label><br />
                                <input name="password" value={password} class="input" onChange={(e) => { setPassword(e.target.value) }} type="text" placeholder="Enter your password" required />
                            </div>
                            <div class="input_div">
                                <label for="Confirmpassword">Confirm Password</label><br />
                                <input name="confirmPassword" value={confirmPassword} class="input" onChange={(e) => { setConfirmPassword(e.target.value) }} type="text" placeholder="Confirm your password" required />
                            </div>
                        </div>
                        {/* <!--end of 3rd input block--> */}

                        <div id="input_div4">
                            <label>Gender</label><br />
                            <div id="input_sub_div4">
                                <div class="input_div">
                                    <input type="radio" value={gender} onChange={(e) => { setGender(e.target.value) }} name="gender" class="radio_input" required />
                                    <label for="Male">Male</label>
                                </div>
                                <div class="input_div">
                                    <input type="radio" value={gender} onChange={(e) => { setGender(e.target.value) }} name="gender" class="radio_input" required />
                                    <label for="Female">Female</label>
                                </div>
                                <div class="input_div">
                                    <input type="radio" value={gender} onChange={(e) => { setGender(e.target.value) }} name="gender" class="radio_input" required />
                                    <label for="no">Prefer not to say</label>
                                </div>
                            </div>
                        </div>
                        {/* <!--end of 4th input block--> */}
                    </div>
                    {/* <!--end of body_div block--> */}

                    {/* <!-- start of footer div--> */}
                    <div id="footer_div">
                        <input type="button" id="input_button" value="Register" onClick={(e) => { submitData(e) }} />
                    </div>
                    {/* <!--End of footer div--> */}
                </div>
            </div>
            <div >
                {
                    allEntry.map((currElement) => {
                        return (
                            <div className="showData">
                                <p>   Full Name : <span>{currElement.fullName} </span></p>
                                <p>   Email : <span>{currElement.email}</span> </p>
                                <p>   Username : <span>{currElement.userName}</span> </p>
                            </div>
                        )
                    })
                }
            </div>
        </>
    )//return end
};

export default Body;
