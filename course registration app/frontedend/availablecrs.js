function showCourses(){
    fetch("http://localhost:8080/course")
    .then((Response) => Response.json())
    .then((courses)=> {
        const datatable=document.getElementById("courseTable")

        courses.forEach(course => {
            var row = `<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.duration}</td>
            <td>${course.trainer}</td>
            </tr>`

            datatable.innerHTML+=row;
        });

    })
}
function showenrolledusers(){
    fetch("http://localhost:8080/course/enrolled")
    .then((Response) => Response.json())
    .then((users)=> {
        const datatable=document.getElementById("enrolledusers")

        users.forEach(user => {
            var row = `<tr>
            <td>${user.name}</td>
            <td>${user.emailId}</td>
            <td>${user.courseName}</td>
            </tr>`

            datatable.innerHTML+=row;
        });

    })
}


